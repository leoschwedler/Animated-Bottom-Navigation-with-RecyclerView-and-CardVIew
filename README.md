# Android App with Animated Bottom Navigation 📱

## 🌟 Overview
This project explores and implements an animated bottom navigation bar in an Android app using fragments. The `AnimatedBottomBar` component facilitates seamless and visually appealing navigation between different sections of the app, each represented by a fragment. The app also showcases various layout managers including Grid Layout Manager (horizontal and vertical), and Linear Layout Manager (horizontal and vertical).

## 🛠️ Project Structure
The project includes a `MainActivity` that utilizes the `FragmentManager` to manage navigation between different fragments using an `AnimatedBottomBar`. Each fragment is designed to represent a specific part of the user interface with distinct layout managers.

### Key Components
- **MainActivity**:
  - Initializes the app and controls navigation between fragments.
  - Uses the `FragmentManager` to manage fragment transactions, such as addition, replacement, and removal.
  - Handles `AnimatedBottomBar` interactions to switch between fragments.

- **Animated Bottom Bar**:
  - Defined in `bottom_menu.xml`, it includes items for Grid Horizontal, Grid Vertical, Linear Horizontal, and Linear Vertical.

- **Fragments**:
  - **GridHorizontalFragment**: Displays a Grid Layout Manager (horizontal).
  - **GridVerticalFragment**: Displays a Grid Layout Manager (vertical).
  - **LinearHorizontalFragment**: Displays a Linear Layout Manager (horizontal).
  - **LinearVerticalFragment**: Displays a Linear Layout Manager (vertical).

- **Buttons**:
  - **toadd**: Button to add items to the list.
  - **remove**: Button to remove items from the list.

- **Divider**:
  - Utilized to separate items within the RecyclerView in different fragments.

## 📷 Screenshots
<div style="display: flex; flex-wrap: wrap;">
  <img src="https://github.com/leoschwedler/Animated-Bottom-Navigation-with-RecyclerView-and-CardVIew/assets/77402907/75afcf6a-3e11-42fe-9e6a-351095d5c401" width="200" style="margin: 10px;"/>
  <img src="https://github.com/leoschwedler/Animated-Bottom-Navigation-with-RecyclerView-and-CardVIew/assets/77402907/65bb41a6-7b6e-4bd9-8044-1b6ba97542fb" width="200" style="margin: 10px;"/>
  <img src="https://github.com/leoschwedler/Animated-Bottom-Navigation-with-RecyclerView-and-CardVIew/assets/77402907/4f768490-e2f6-4ca8-a88c-f9a40740e126" width="200" style="margin: 10px;"/>
  <img src="https://github.com/leoschwedler/Animated-Bottom-Navigation-with-RecyclerView-and-CardVIew/assets/77402907/5ba97069-01a1-4b5c-881f-7bf727314f25" width="200" style="margin: 10px;"/>
</div>

## 📹 Video
<div style="margin: 20px 0;">
  
  https://github.com/leoschwedler/Animated-Bottom-Navigation-with-RecyclerView-and-CardVIew/assets/77402907/e4716b04-a3a9-421f-ab08-eaad4db48fce
  
</div>

## 🚀 Implemented Features
The project demonstrates the following functionalities:
- Dynamically adding fragments to the layout using `FragmentManager`.
- Using `FragmentTransaction` to handle fragment transactions.
- Implementing an animated bottom navigation bar to switch between different fragments.
- Utilizing RecyclerView with different layout managers:
  - Grid Layout Manager (horizontal and vertical).
  - Linear Layout Manager (horizontal and vertical).
- Adding dividers to separate items in the RecyclerView.
- Adding and removing items from the list using the **toadd** and **remove** buttons.

## 🛠️ Dependencies
- `RecyclerView`
- `CardView`
- `Animated-Bottom-Navigation-with-RecyclerView-and-CardView`
- Additional libraries as needed for functionality.

## 📌 License
This project is open-source and available under the [MIT License](LICENSE).
