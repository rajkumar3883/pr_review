## METHODS DECLARATION ##
def checkForFileAndroid(file)
  ext = File.extname(file)
  case ext
  # Warn when a file .gradle is modified
  when ".gradle"
    message("`#{file}` was modified")
  end
  # Warn when a FileManifest.xml is modified
  message("`#{file}` was modified") if file =~ /AndroidManifest\.xml/
end
def exceptionMessages(file)
  if File.file?(file)
    message "Something went wrong checking `#{file}`. Check your Dangerfile"
  else
    message "One of modified files could not be read, does it really exist?"
  end
end

# Warning on big Pr
warn("Big PR: Your pr contains more than 500 lines of code") if git.lines_of_code > 2
# Mainly to encourage writing up some reasoning about the PR, rather than
# just leaving a title
if github.pr_body.length < 10
  warn "Please provide a summary in the Pull Request description"
end
# Ensure that the PR title follows the convention
if !(github.pr_title =~ /\[VYNG-([0-9])+\](.*)/)
  warn "The Pull Request title does not follow the convention [VYNG-0000] PR Title text"
end
#Check modified files, apply rules to them
git.modified_files.each do |file|
  begin
    checkForFileAndroid(file)
  rescue
    exceptionMessages(file)
  end
end
# AndroidLint
android_lint.report_file = "app/build/reports/lint-results.xml"
android_lint.skip_gradle_task = false
android_lint.filtering = false
android_lint.severity = "Warning"
android_lint.lint(inline_mode: false)
