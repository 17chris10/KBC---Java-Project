# Kaun Banega Crorepati (KBC) Web Application

A full-stack, interactive quiz game based on the famous Indian TV game show *Kaun Banega Crorepati*. Players answer 15 multiple-choice questions with increasing prize money, starting from ₹1,000 up to the ₹7 Crore jackpot!

---

## 🌟 Key Features

* **Complete Game Flow**: Includes a Welcome Screen, Rules & Regulations screen with mandatory agreement, Main Game Screen, and Results Screen.
* **Text-to-Speech (Voice Assistant)**: Automatically reads each question out loud using smooth, built-in browser voice narration.
* **Interactive Lifelines**:
  * **50:50**: Removes two incorrect options.
  * **Audience Poll**: Displays simulated percentage votes for each option.
  * **Double Dip**: Gives the player two chances to pick the correct answer on a single question.
* **Game Timer**:
  * Questions 1–5: 45 seconds
  * Questions 6–10: 60 seconds
  * Questions 11–15: No time limit (∞)
* **Random Question Sets**: Automatically selects a random question set (from 4 database sets) every time a new game starts.
* **Sound Effects**: Includes custom sound effects for winning the ₹7 Crore jackpot.

---

## 🛠️ Tech Stack

* **Frontend**: HTML5, CSS3, JavaScript (Vanilla ES6)
* **Backend**: Java 17, Spring Boot 3
* **Database**: MySQL 8.0
* **Build Tool**: Maven

---

## 📁 Project Structure

```text
kbc-game/
├── src/
│   └── main/
│       ├── java/
│       │   └── KBC/
│       │       ├── controller/   # API endpoints for game setup
│       │       ├── model/        # Question data structure
│       │       ├── repository/   # Database queries & random set picker
│       │       └── service/      # Game engine logic
│       └── resources/
│           └── static/
│               ├── index.html    # Main user interface
│               ├── style.css     # Styling & layout
│               ├── script.js     # Frontend game logic & voice speech
│               └── sounds/       # Audio files
└── pom.xml                       # Maven configuration
```
🚀 How to Run the Application
Prerequisites
* Java 17 or higher installed
* MySQL Server installed and running

Steps
1. Clone the Repository:
Bash
git clone [https://github.com/17chris10/KBC---Java-Project.git](https://github.com/17chris10/KBC---Java-Project.git)
cd kbc-web-game

2. Configure Database Credentials:
Open src/main/java/KBC/repository/QuestionBank.java and update your database details:
Java
private static final String URL = "jdbc:mysql://localhost:3306/kbc_db";
private static final String USER = "your_mysql_username";
private static final String PASSWORD = "your_mysql_password";

👥 Contributors
Chriselle Bijoy
Isha Pitale
Mrunmayee Deore
Anwesha Padmawar
