Flashcard Quiz App

A simple, fun flashcard quiz app built in Kotlin using Android Studio. It helps users test their general knowledge using True/False questions and provides instant feedback, a score summary, and a review section.

This app was developed as part of the IMAD5112 Mobile Development Assignment.

---

# Repository Link

[ View GitHub Repository](https://github.com/luka3000-lab/Assignment2)

---

## 📺 Video Presentation

(https://youtu.be/SxV3f5maNcs)

---

 App Features
 Welcome Screen
Displays a warm greeting and a Start button.

 Question Screen
5 True/False questions shown one at a time.

Parallel arrays are used to hold questions and answers.

After answering, the app shows Correct or Incorrect.

The Next button moves to the next question.

Score Screen
Displays the user’s total correct answers.

Shows one of two messages based on score:

“Great Job!” if the user scores 3 or more.

“Keep Practicing!” if they score less than 3.

Offers a Review button and an Exit button.

Review Screen
Lists all 5 questions along with the correct answers.

Helps the user learn from their mistakes.

Design & Code Structure
Activities:

MainActivity (Welcome screen)

FlashcardActivity (Quiz logic)

ScoreActivity (Results and review)

Data Storage:

Two parallel arrays (questions and answers) are used.

Logic:

A loop controls question flow.

If statements handle feedback and scoring.

UX/UI:

Each layout uses a custom background and is kept clean and user-friendly.

Clear button labels and spaced-out content ensure easy interaction.


