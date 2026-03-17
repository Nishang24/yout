<<<<<<< HEAD
# yout
=======
>>>>>>> 1f77d94 (Initial commit)
# YouTube Clone Android App

A high-performance, feature-rich YouTube clone built for Android using Java. This project demonstrates the implementation of a modern media application, focusing on seamless video streaming, interactive UI components, and scalable architecture.

---

## 🚀 Key Features in Detail

### 1. Dynamic Home Feed
- **RecyclerView Implementation**: Uses a highly optimized `RecyclerView` with custom `ViewHolder` patterns to ensure smooth scrolling even with high-resolution thumbnails.
- **Image Caching**: Integrated **Glide** to handle image loading, caching, and memory management, preventing UI stutters when scrolling through long lists.
- **Material 3 Design**: Leverages the latest Material Design guidelines for a modern look and feel, including elevation, ripple effects, and responsive layouts.

### 2. Advanced Video Playback
- **Media3 ExoPlayer**: Implements the industry-standard media player for Android.
- **Adaptive Streaming**: Ready for HLS/DASH streaming, ensuring the best video quality based on the user's internet speed.
- **Activity Lifecycle Management**: The player is carefully synced with the Android Activity lifecycle (`onStart`, `onStop`, `onRelease`) to prevent memory leaks and ensure background audio/video is handled correctly.

### 3. User Interface (UI/UX)
- **Top Bar Branding**: A custom toolbar that mimics the official YouTube app, featuring branding, search, notifications, and profile icons.
- **Category Chips**: A horizontal scrollable list of "Chips" (All, Music, Gaming, etc.) allowing users to theoretically filter content.
- **Bottom Navigation**: Persistent navigation for quick switching between Home, Shorts, Subscriptions, and Library.
- **Responsive Layouts**: Uses `ConstraintLayout` extensively to ensure the UI looks great on phones, tablets, and foldable devices.

---

## 🛠 Tech Stack Deep Dive

- **Media Player**: `androidx.media3` (ExoPlayer) - Provides high-level APIs for media playback with support for local and networked files.
- **Networking**: `Retrofit` & `Gson` - Configured for REST API communication (ready to connect to YouTube Data API).
- **Image Loading**: `Glide` - Chosen for its efficiency in handling bitmap decoding and disk caching.
- **UI Components**: `CoordinatorLayout`, `AppBarLayout`, `BottomNavigationView`, and `MaterialCardView`.
- **Language**: `Java` - Built using standard Java 11 for broad compatibility and stability.

---

## 📂 Project Architecture & Logic

### Data Flow
1. **Model**: `Video.java` defines the structure (ID, Title, URL, Views, etc.).
2. **Adapter**: `VideoAdapter.java` binds the data models to the XML layouts in `item_video.xml`.
3. **Intent System**: When a video is clicked, `MainActivity` passes the video metadata to `PlayerActivity` via a `Bundle`.

### Playback Logic
In `PlayerActivity`, the `ExoPlayer` instance is built using a `DefaultRenderersFactory`. It takes the URL passed from the intent, creates a `MediaItem`, and prepares the player asynchronously to ensure the UI remains responsive during buffer loading.

---

## 📅 Future Plan (Roadmap)

### Phase 1: Core Enhancements
- [ ] **Search Engine**: Add a functional search bar with suggestions.
- [ ] **Video Categories**: Implement real filtering logic for the category chips.
- [ ] **Likes & Dislikes**: Add interactive buttons with state persistence.

### Phase 2: User Experience & Social
- [ ] **Comments Section**: A bottom sheet or scrollable section for user discussions.
- [ ] **User Accounts**: Integration with **Firebase Authentication** or Google Sign-In.
- [ ] **Channel Pages**: Detailed views for creators, showing their video list and "About" info.

### Phase 3: Advanced Media Features
- [ ] **Picture-in-Picture (PiP)**: Allow users to watch videos while using other apps.
- [ ] **Offline Downloads**: Save videos locally using ExoPlayer's `DownloadManager`.
- [ ] **Live Streaming**: Support for RTMP/HLS live feeds.
- [ ] **Shorts**: A vertical, swipeable video feed for short-form content.

---

## 📦 Installation & Setup

<<<<<<< HEAD
1. **Clone**: `git clone https://github.com/Nishang24/yout.git`
=======
1. **Clone**: `git clone https://github.com/your-username/yout.git`
>>>>>>> 1f77d94 (Initial commit)
2. **Build**: Open in Android Studio and let Gradle download dependencies.
3. **Permissions**: The app requires `<uses-permission android:name="android.permission.INTERNET" />` which is already included in the Manifest.
4. **Run**: Deploy to any device running Android 7.0 (API 24) or higher.

---

## 📄 License
Copyright © 2024. This project is open-source and intended for educational purposes. Feel free to fork and build upon it!
