# 🚀 IdeaForge – Android App

**IdeaForge** is an Android application that empowers students to transform their innovative ideas into fully realized projects through a collaborative, mentorship-driven ecosystem. It connects creators, mentors, and funders in a unified platform that nurtures student innovation from ideation to execution.

---

## 📱 Features

- 🔍 **Discover & Browse Ideas**: View ideas submitted by other students.
- 🧠 **Submit Your Idea**: Share your innovative concepts with the community.
- 🤝 **Collaboration Hub**: Connect with students and mentors for team-building.
- 🎓 **Mentorship**: Get expert guidance from experienced professionals.
- 💰 **Funding Opportunities**: Seek financial backing for promising ideas.
- 🔐 **User Authentication**: Sign up, log in, and manage your account securely.
- 📈 **Dashboard**: Monitor your submissions, collaborations, and feedback.

---

## 🛠️ Tech Stack

- **Language**: Kotlin
- **Framework**: Android SDK
- **Architecture**: MVVM
- **Backend**: Firebase (Authentication, Firestore)
- **UI**: XML Layouts, Material Design Components

---

## 📂 Project Structure

```bash
IdeaForge/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/ideaforge/
│   │   │   │       ├── activities/       # All Activity classes
│   │   │   │       ├── adapters/         # RecyclerView adapters
│   │   │   │       ├── models/           # Data models
│   │   │   │       ├── utils/            # Utility classes
│   │   │   │       └── firebase/         # Firebase helper functions
│   │   │   └── res/
│   │   │       ├── layout/               # XML UI layouts
│   │   │       ├── values/               # Strings, colors, styles
│   │   │       └── drawable/             # Icons, backgrounds
└── build.gradle
```

## 🚀 Getting Started

📋 Prerequisites
- Android Studio (latest version)
- Kotlin Plugin
- Firebase Account (with Firestore & Auth enabled)

## 🔧 Setup Instructions
1. Clone the Repository:
  - git clone https://github.com/akshaysonee/IdeaForge-Android-App.git
  - cd IdeaForge-Android-App
     
2. Open in Android Studio:
  - File > Open > Select the IdeaForge-Android-App directory

3. Configure Firebase:
  - Replace the google-services.json file with your Firebase project's credentials
  - Make sure Firebase Authentication and Firestore are enabled

4. Build and Run the App:
  - Click Run ▶️ in Android Studio or use Shift + F10

## 🔐 Authentication Screens
  - Login Screen
  - Signup Screen
  - Forgot Password Screen

Each screen includes field validation, Firebase integration, and navigation flows.


📄 License

This project is open-source and available under the MIT License.
