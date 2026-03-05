# Business Card Android App (Kotlin)

This is a simple Android application written in Kotlin that displays a digital business card on a single screen.

![Business Card App screenshot](bussinesscard.png)

## Features

- Shows **full name**, **job title**, and **company**.
- Shows **phone number** and **email address**.
- Phone number and email are **clickable** (open dialer and email apps using Android's auto-linking).
- Clean, centered layout with a simple card-style design.

## Project structure (important files)

- `build.gradle.kts` – Root Gradle configuration.
- `settings.gradle.kts` – Project and repository setup.
- `gradle.properties` – Gradle and AndroidX settings.
- `app/build.gradle.kts` – Android app module configuration (Kotlin + XML layout).
- `app/src/main/AndroidManifest.xml` – Application manifest.
- `app/src/main/java/com/example/businesscard/MainActivity.kt` – Main Activity written in Kotlin.
- `app/src/main/res/layout/activity_main.xml` – Main screen layout (business card UI).
- `app/src/main/res/values/strings.xml` – Text values (name, job title, company, phone, email).
- `app/src/main/res/values/colors.xml` – Basic color palette.
- `app/src/main/res/values/themes.xml` – App theme.

## How to open and run (for your instructor or grader)

1. **Clone the repository**

   ```bash
   git clone https://github.com/Herodev89/BUSSINESS-CARD-APP.git
   cd BUSSINESS-CARD-APP
   ```

2. **Open in Android Studio**

   - Open Android Studio.
   - Choose **"Open an existing project"**.
   - Select the `BUSSINESS-CARD-APP` folder.
   - Let Android Studio download Gradle dependencies and index the project.

3. **Run the app**

   - Connect an Android device (with USB debugging) or start an Android emulator.
   - In Android Studio, click the **Run** button.
   - Choose the `app` configuration if asked.

The app should build and launch showing the business card screen with your details.

## Customizing the business card

- Open `app/src/main/res/values/strings.xml` and change:
  - `full_name`
  - `job_title`
  - `company_name`
  - `phone_number`
  - `email_address`

No code changes are required for basic text updates.

## New: Share contact

- A "Share" button was added to the main screen. Tap it to share the contact details (name, title, company, phone, email) using Android's share sheet — useful for sending your card via messaging apps or email.

To change the share button label, edit `@string/share_button` in `app/src/main/res/values/strings.xml`.

