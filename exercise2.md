## git add .........
Selects your file and move it to the staging area.

## git commit -m "..........."
You need git commit -m after you used git add, then you can see all changes from the project

# How to use git add and git commit

1. Open Git Bash.

2. Go to your root.
    ![Alt-Text](1-Path.png)

3. Use git add for the markdown documents.
    ![Alt-Text](2-GitAdd.png)

4. Use git commit -m "........" for the markdown documents.
    ![Alt-Text](3-GitCommit.png)

5. Create the document .gitignore.
    ![Alt-Text](4-Touch.png)

6. Ask for the git status.
    ![Alt-Text](5-GitStatus.png)

7. Write in the .gitignore document, what you want to ignore. In my case I want to ignore html and pdf documents.
    ![Alt-Text](6-GitIgnoreHtmlPdf.png)

8. Ask again about the git status and you can see, that the html-document and the pdf-document is not there anymore.
    ![Alt-Text](7-GitStatusIgnore.png)
   
9.  Use git add to add the .gitignore document
    ![Alt-Text](8-GitAddIgnore.png)

10. Use git commit -m "........" to finish the process.
    ![Alt-Text](9-GitCommitIgnore.png)

