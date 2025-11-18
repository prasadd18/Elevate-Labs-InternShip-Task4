NotesApp 
Overview
NotesApp is a simple console-based Notes Manager written in Java.

Features
Add Notes Enter a note and save it to a file.

View Notes  Display all notes currently stored in the system.
Exit Close the program.

How It Works
The program runs in a loop and shows a menu with options (Add, View, Exit).
You choose an option by typing a number (1–3).
Based on your choice:
Add Notes Appends your note to Notes.txt.
View Notes Reads and prints all notes from Notes.txt.
Exit Stops the program.

NotesApp Class
addNotes() Prompts user for input and writes notes to a file.
viewNotes()  Reads notes from the file and displays them.
Uses a Scanner for user input.
Runs a loop with a menu for operations.
