## git add .........
Selects your file and move it to the staging area.

## git commit -m "..........."
You need git commit -m after you used git add, then you can see all changes from the project

# How to use git add and git commit

1. Open Git Bash.

2. Go to your root.
    ![Alt-Text](resources/images/2-01Path.png)

3. Use git add for the markdown documents.
    ![Alt-Text](resources/images/2-02GitAdd.png)

4. Use git commit -m "........" for the markdown documents.
    ![Alt-Text](resources/images/2-03GitCommit.png)

5. Create the document .gitignore.
   ![Alt-Text](resources/images/2-04Touch.png)

6. Ask for the git status.
    ![Alt-Text](resources/images/2-05GitStatus.png)

7. Write in the .gitignore document, what you want to ignore. In my case I want to ignore html and pdf documents.
    ![Alt-Text](resources/images/2-06GitIgnoreHtmlPdf.png)

8. Ask again about the git status and you can see, that the html-document and the pdf-document is not there anymore.
    ![Alt-Text](resources/images/2-07GitStatusIgnore.png)
   
9.  Use git add to add the .gitignore document
    ![Alt-Text](resources/images/2-08GitAddIgnore.png)

10. Use git commit -m "........" to finish the process.
    ![Alt-Text](resources/images/2-09GitCommitIgnore.png)

