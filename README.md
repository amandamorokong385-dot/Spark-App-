## Social Sparks App

# Purpose
Cora struggles with social connections on busy days. This Android app helps by suggesting small social sparks based on the time of the
day (Morning, Afternoon, Dinner, etc.) to help her stay connected and make it fun. The app is designed to be quick, intuitive and encouraging
so Cora can use it even during her busiest moments.

## Design Considerations
- Text input: An 'EditText' field where the user types the time of day e.g., Morning, Afternoon, Dinner.
- Display Suggestions: A 'TextView' that shows the social spark suggestion based on the input.
- Reset Button: A button that clears both the input field and suggestion text, allowing for a fresh start.
- Error Handling: if the user enters an unrecognized time, the app shows a friendly message if invalid
- Uses if-else statements in Kotlin to match the input to the correct social spark.

## SocialSpark Logic
- Morning: Send a "Good morning" text to a family member.
- Mid-morning: Reacg out to a colleague with a quick "Thank you" message.
- Afternoon: Share a funny meme or link with a friend.
- Snack Time: Send a quick "Thinking of you" message.
- Dinner: Call a friend or relative for a 5-minute catch-up.
- Night: Leave a thoughful comment on a friend's post.

## GitHub and GitHub Actions:
- GitHub Repository: Added a workflow file at the '.github/workflows/build.yml' that automatically builds the app with Gradle on every
  push to the 'main' branch. This ensures the app woeks not just on my computes, but in a clean environment, making the project robust
  and maintable.

## Testing and logging
- Manual testing: The app was thorouly tested on an andriod emulator to ensure all features work seamlessly- including valid inputs,
- invalid inputs, and the reset button.
- Logging: used log.d(SparkApp) ro track input viewed in logcat to help monitor the app's behavior in real time.

## Screenshots
<img width="903" height="489" alt="Main" src="https://github.com/user-attachments/assets/2a499fe6-745f-46aa-ab5b-9bdd3b521b4a" />
<img width="898" height="434" alt="Error" src="https://github.com/user-attachments/assets/31bc48cb-47ac-4396-a091-c61272adf7d5" />
<img width="917" height="450" alt="suggestion" src="https://github.com/user-attachments/assets/308ac4b3-1d77-414d-b6a7-d9cf8392d52f" />

## Video Demonstration
[Watch the full app demo on YouTube] https://youtube.com/shorts/4j21y1xNvbg?si=5Bxz-I_rPai7Jsxr









