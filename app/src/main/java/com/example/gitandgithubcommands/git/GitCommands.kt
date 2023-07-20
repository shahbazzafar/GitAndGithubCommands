package com.example.gitandgithubcommands.git

/*Terminal Basics*/
//(1) cd desktop
//(2) ls or dir command ==> for get sub folders
//(3) cls ==> for clear terminal
//(4) cd ../ ==> for go back to previous folder

/*HOW TO WORK GIT*/
//(1) Working Area Or Untracked Files ==> Not covered by Git
//(2) Tracked Area ==> When we call git add . command
//(3) Staging Area ==> When we call git commit -m "initial commit"
//(4) Git Directory ==> When we call git push origin master

/*Git Process*/
//Note ==> We can also store folders on github with these commands
//(1) git init ==> initiate git process
//(2) git status ==>
//(3) git add .
//(4) git commit -m "initial commit"
//(5) git remote add origin https://github.com/shahbazzafar/GitAndGithubCommands.git ==> Address of the location where we want to store project on github
//(6) git push -u origin master
//(7) git log ==> show the hash code and details about the recent commits
//(8) gitignore ==> a file used to ignore the files which you don't want to store on github
//(9) git clone https://github.com/shahbazzafar/GitAndGithubCommands.git
//(10) git branch ==> shows all branches
//(11) git branch "DEV" ==> create new branch
//(12) git checkout master
//(13) git pull origin master
//(14) git merge DEV

/*Project Updates*/
//(1) git commit --amend -m "Hello Word" ==> if we want to change commit after push
//(2) git reset ==> make all files untracked
