package com.basebox.fun_fact

object DummyData {
    val facts  = listOf(FactModel("Kotlin", R.drawable.kotlin_logo,
        "The name comes from kotlin island near St. petersburg. Andrey Bransley" +
                " mentioned that the team decided to name"),
        FactModel("Java", R.drawable.ic_java_logo,
            "The language was initially called Oak after an Oak tree that stood outside Gostling's Office. Later the project was renamed to Java."),
        FactModel("Python", R.drawable.python_logo,
            "Why is it called Python?... When he began implementing Python, Guido Van Russom was also reading the pubished "),
        FactModel("Javascript", R.drawable.js_logo,
            "The name Javascript came from Netscape support for Java Applets within its browser."),
        FactModel("PHP", R.drawable.php_logo,
            "PHP originall stood for Person Home Page, but it now stands for the recursive initialism PHP: Hypertext Preprocessor.")
    )
}