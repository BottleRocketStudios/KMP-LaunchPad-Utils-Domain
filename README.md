# LaunchPad Quick Start for Kotlin Multiplatform

LaunchPad is an open-source, free-to-use project designed to empower you to bring your Kotlin Multiplatform projects to market faster. It provides a collection of tools and utilities to streamline your development process and eliminate the need for
reinventing the wheel.

## LaunchPad Utils Domain

This library offers a comprehensive set of domain utility interfaces and functions to simplify your coding experience. It empowers you to:

- Create beautiful and functional Compose UIs with ease.
- Reduce boilerplate code and focus on your core logic.
- Leverage pre-built components for common UI patterns.

## Contributing

We welcome contributions from all developers! If you're interested in getting involved, please refer to the  [`CONTRIBUTING.md`](./CONTRIBUTING.md) document for details.

## Key Features

### Analytics

Interfaces that make it easy to track user actions and interactions with detailed event information.

### Logging

Provides comprehensive logging functionalities to track application behavior and troubleshoot issues effectively.

## Usage

To integrate LaunchPad utils domain into your project, add the following dependency with the latest version number:

```kotlin
    commonMain.dependencies {
    ...
    implementation("com.github.bottlerocketstudios:kmp-launchpad-utils-domain:<version>")
}
```

### Creating Personal Access Token (PAT)

#### Step 1: Creating a Personal Access Token on GitHub

1. ###### Log in to GitHub:
   Open your web browser and navigate to GitHub. Log in with your GitHub credentials.

2. ###### Access Token Settings:

- Click on your profile picture in the top-right corner.
- Select "Settings" from the dropdown menu.
- In the left sidebar, click on "Developer settings."

3. ###### Generate Token:

- In the "Access tokens" section, click on "Generate token."
- Provide a suitable name for your token.
- Select the scopes (permissions) needed for your use case. For general use, "repo" and "read:user" are often sufficient.
- Click "Generate token."

4. ###### Copy Token:

- After generating the token, copy it to your clipboard immediately.
- Note: This token is displayed only once. Ensure you securely store it.

#### Step 2: Configuring the Token Locally

Now that you have generated your PAT, you'll need to configure it on your local machine.

1. ###### Open your terminal:

- Open the terminal or command prompt on your computer.

2. ###### Set Environment Variables:

- Run the following commands, replacing YOUR_TOKEN_HERE with the actual token you copied:

```bash
export LOCAL_GITHUB_TOKEN=YOUR_TOKEN_HERE
export LOCAL_GITHUB_USERNAME=your-github-email@example.com
```

Alternatively, you can add these lines to your shell profile file (e.g., .bashrc, .zshrc, or .bash_profile) to make them persistent.

3. ###### Verify Configuration:

- To verify that your environment variables are set correctly, you can echo them in the terminal:

```bash
echo $LOCAL_GITHUB_TOKEN
echo $LOCAL_GITHUB_USERNAME
```

You should see the values you set.