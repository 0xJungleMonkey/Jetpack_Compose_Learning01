# jetpack_compose_learning01
Jetpack Compose is a modern toolkit designed to simplify UI development. It combines a reactive programming model with the conciseness and ease of use of the Kotlin programming language. It is fully declarative, meaning you describe your UI by calling a series of functions that transform data into a UI hierarchy. When the underlying data changes, the framework automatically re-executes these functions, updating the UI hierarchy for you.

A Compose app is made up of composable functions - just regular functions marked with @Composable, which can call other composable functions. A function is all you need to create a new UI component. The annotation tells Compose to add special support to the function for updating and maintaining your UI over time. Compose lets you structure your code into small chunks. Composable functions are often referred to as "composables" for short.

By making small reusable composables, it's easy to build up a library of UI elements used in your app. Each one is responsible for one part of the screen and can be edited independently.

Note: In this codelab, the terms "UI Components," "Composable functions," and "composables" are used interchangeably to refer to the same concept.
What you'll do
In this codelab, you will learn:

What Compose is
How to build UIs with Compose
How to manage state in composable functions
How to create a performant list
How to add animations
How to style and theme an app
You'll build an app with an onboarding screen, and a list of animated expanding items:

The project is already configured to use Compose.
The AndroidManifest.xml file is created.
The build.gradle and app/build.gradle files contain options and dependencies needed for Compose.
After syncing the project, open MainActivity.kt and check out the code.

Composable functions
A composable function is a regular function annotated with @Composable. This enables your function to call other @Composable functions within it. You can see how the Greeting function is marked as @Composable. This function will produce a piece of UI hierarchy displaying the given input, String. Text is a composable function provided by the library.

Compose in an Android app
With Compose, an Activity remains the entry point to an Android app. In our project, MainActivity is launched when the user opens the app (as it's specified in the AndroidManifest.xml file). You use setContent to define your layout, but instead of using an XML file as you'd do in the traditional View system, you call Composable functions within it.

To use the Android Studio preview, you just have to mark any parameterless Composable function or functions with default parameters with the @Preview annotation and build your project. You can have multiple previews in the same file and give them names.

4. Tweaking the UI
   Let's start by setting a different background color for the Greeting. You can do this by wrapping the Text composable with a Surface. Surface takes a color, so use MaterialTheme.colorScheme.primary.
   The Material components, such as androidx.compose.material3.Surface, are built to make your experience better by taking care of common features that you probably want in your app, such as choosing an appropriate color for text. We say Material is opinionated because it provides good defaults and patterns that are common to most apps. The Material components in Compose are built on top of other foundational components (in androidx.compose.foundation), which are also accessible from your app components in case you need more flexibility.

In this case, Surface understands that, when the background is set to the primary color, any text on top of it should use the onPrimary color, which is also defined in the theme. You can learn more about this in the Theming your app section.
Modifiers: Most Compose UI elements such as Surface and Text accept an optional modifier parameter. Modifiers tell a UI element how to lay out, display, or behave within its parent layout.
For example, the padding modifier will apply an amount of space around the element it decorates. You can create a padding modifier with Modifier.padding().
5. Reusing composables
The more components you add to the UI, the more levels of nesting you create. This can affect readability if a function becomes really large. By making small reusable components it's easy to build up a library of UI elements used in your app. Each one is responsible for one small part of the screen and can be edited independently.

As a best practice, your function should include a Modifier parameter that is assigned an empty Modifier by default. Forward this modifier to the first composable you call inside your function. This way, the calling site can adapt layout instructions and behaviors from outside of your composable function.

The three basic standard layout elements in Compose are Column, Row and Box.

