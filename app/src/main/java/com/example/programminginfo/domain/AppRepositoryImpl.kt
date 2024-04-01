package com.example.programminginfo.domain

import com.example.programminginfo.R
import com.example.programminginfo.data.InformationData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepositoryImpl @Inject constructor() : AppRepository {
    private val list = listOf(
        InformationData(
            "C++",
            R.drawable.ic_c_plus,
            "C++ is an object-oriented programming (OOP) language that is viewed by many as the best language for creating large-scale applications. C++ is a superset of the C language.\n" +
                    "\n" +
                    "A related programming language, Java, is based on C++ but optimized for the distribution of program objects in a network such as the internet. Java is somewhat simpler and easier to learn than C++ and has characteristics that give it other advantages over C++. However, both languages require a considerable amount of study.\n" +
                    "\n" +
                    "C++ allows software developers to define their own data types and manipulate them using functions and methods. It also allows low-level programming and provides access to memory, enabling fast and efficient execution of code. It also supports generic programming using templates, which let code be written in a generic form and reused for different data types.\n" +
                    "\n" +
                    "C++ is used in fields such as system software, game development, embedded systems, scientific computing and high-performance applications. The C++ standard library provides a range of coding utilities and functions, making it easy to develop complex software systems. C++ can run on many platforms, including Linux, Mac and Windows.\n" +
                    "\n" +
                    "Diagram showing the four key elements of object-oriented programming\n" +
                    "Object-oriented programming is a type of programming language that uses classes, properties, objects and methods.\n" +
                    "How to use C++\n" +
                    "There are several ways to learn C++, such as online tutorials, courses and interactive exercises. To start programming in C++, developers need a C++ compiler that translates code into machine-readable instructions. C++ compilers include Clang, GNU Compiler Collection and Microsoft Visual C++. Once a compiler is installed, developers can use a text editor or integrated development environment (IDE) to write C++ code. IDEs offer features such as code completion, debugging tools and management capabilities.\n" +
                    "\n" +
                    "C++ programs are usually organized into functions. The main() function is the entry point of the computer program where execution begins. Developers can use control structures such as loops and conditionals to control their program's flow. C++ also provides a set of libraries that offer prebuilt functions and data structures for common tasks.\n" +
                    "\n" +
                    "List of steps followed by code compilers\n" +
                    "C++ uses compilers, which perform several analytical steps before outputting code.\n" +
                    "How to write C++ code\n" +
                    "When writing code in C++, the following are some basic functions:\n" +
                    "\n" +
                    "C++ code. One of the easiest codes for beginners is the \"Hello World!\" code which uses the iostream library and the std namespace:\n" +
                    "\n" +
                    "#include <iostream>\n" +
                    "\n" +
                    "Int main(){\n" +
                    "\n" +
                    "      std::cout<<\"Hello, World! <<std:endl;\n" +
                    "\n" +
                    "      return 0\n" +
                    "\n" +
                    "}\n" +
                    "In this example, the line #include <iostream> enables input/output functionality. Additionally, using std::cout lets the output be printed to the console. The std::endl line provides a line break. The return 0 statement indicates a successful program execution.\n" +
                    "\n" +
                    "Arrays and memory allocation. C++ allows developers to work with arrays, which are collections of elements of the same data type. Here's an example of initializing and accessing elements in an array:\n" +
                    "\n" +
                    "#include <iostream>\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "int main() {\n" +
                    "\n" +
                    "    int numbers[5] = {1, 2, 3, 4, 5};\n" +
                    "\n" +
                    " \n" +
                    "  \n" +
                    "\n" +
                    "    for (int i = 0; i < 5; i++) {\n" +
                    "\n" +
                    "        std::cout << numbers[i] << \" \";\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    return 0;\n" +
                    "\n" +
                    "}\n" +
                    "In this instance, developers declare an array numbers of size 5 and initialize its elements using curly braces {}. The for loop allows users to iterate over the array and print each element using std::cout.\n" +
                    "\n" +
                    "C++ classes and constructors. C++ supports OOP with the use of classes. Here's an example of a simple class with a constructor and member functions:\n" +
                    "\n" +
                    "#include <iostream>\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "class Rectangle {\n" +
                    "\n" +
                    "private:\n" +
                    "\n" +
                    "    int length;\n" +
                    "\n" +
                    "    int width;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "public:\n" +
                    "\n" +
                    "    Rectangle(int l, int w) {\n" +
                    "\n" +
                    "       length = l;\n" +
                    "\n" +
                    "       width = w;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    int calculateArea() {\n" +
                    "\n" +
                    "        return length * width;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "};\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "int main() {\n" +
                    "\n" +
                    "    Rectangle myRectangle(5, 3);\n" +
                    "\n" +
                    "    int area = myRectangle.calculateArea();\n" +
                    "\n" +
                    "    std::cout << \"Area: \" << area << std::endl; \n" +
                    "\n" +
                    "    \n" +
                    "\n" +
                    "    return 0;\n" +
                    "\n" +
                    "    }\n" +
                    "Developers can define a class called Rectangle with private data members length and width. The constructor Rectangle(int l, int w) initializes the object's attributes, while the member function calculateArea () calculates and returns the area of the rectangle.\n" +
                    "\n" +
                    "Polymorphism and C++ standard library. C++ supports polymorphism, allowing objects to be treated as instances of their base or derived classes interchangeably. Additionally, the C++ standard library provides a rich set of functionalities. The following is an example:\n" +
                    "\n" +
                    "#include <iostream>\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "class Shape {\n" +
                    "\n" +
                    "public:\n" +
                    "\n" +
                    "    virtual void display() {\n" +
                    "\n" +
                    "        std::cout << \"Shape\" << std::endl;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "};\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "class Circle : public Shape {\n" +
                    "\n" +
                    "public:\n" +
                    "\n" +
                    "    void display() {\n" +
                    "\n" +
                    "        std::cout << \"Circle\" << std::endl;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "};\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "int main() {\n" +
                    "\n" +
                    "    Shape* shape = new Circle();\n" +
                    "\n" +
                    "    shape->display();                   // Polymorphism\n" +
                    "\n" +
                    "   \n" +
                    "\n" +
                    "    delete shape;                       // Memory deallocation\n" +
                    "\n" +
                    "   \n" +
                    "\n" +
                    "    return 0;\n" +
                    "\n" +
                    "}\n" +
                    "A base class Shape and a derived class Circle are defined. The display () function is marked as virtual in the base class, enabling polymorphism. By creating a Circle object and assigning it to a Shape pointer, a developer can invoke the derived class's display() function.\n" +
                    "\n" +
                    "What are the uses of C++?\n" +
                    "C++ is used in a wide range of ways to capitalize on its versatility and performance. Some of the main uses of C++ include the following:\n" +
                    "\n" +
                    "Operating systems (OSes). C++'s low-level capabilities allow for efficient memory management and system resource controls, making it well-suited for the development of OSes.\n" +
                    "Games and graphics. C++'s high performance and ability to interact with hardware makes it a good choice for game engines such as Epic Games' Unreal Engine and Unity Technologies' Unity, which are built using C++. The programming language is also used for graphics programming tasks, such as real-time rendering, image processing and physics simulations.\n" +
                    "Embedded systems. C++ is commonly used in the development of embedded systems, which are computer systems designed to perform specific tasks. Examples of embedded systems include medical devices, automotive systems and internet of things devices.\n" +
                    "Software libraries. C++ serves as the foundation for many high-level libraries used in various domains. Libraries like Boost provide additional functionality and utilities for C++ programmers, while the Standard Template Library (STL) offers a collection of generic data structures and algorithms. These libraries provide ready-to-use components, enhancing developer productivity.\n" +
                    "High-performance computing (HPC). C++ is well suited for HPC applications that require maximum computational efficiency and parallel processing. It's used in scientific simulations, numerical analysis, mathematical modeling and simulations of physical phenomena. It's often used alongside specialized libraries such as message passing interface and OpenMP for distributed and parallel computing.\n" +
                    "Web development. Although C++ isn't commonly used for web development, it plays a crucial role in the back end of web applications, such as web servers, network protocols, routers and communication software. Many web frameworks and servers, including the Apache HTTP Server, are implemented in C++. The language's speed and reliability make it suitable for handling high-traffic websites and complex server-side operations.\n" +
                    "Systems programming. C++ is often used for systems programming tasks, where interaction with the underlying hardware and OS is required. Tasks such as device drivers, network protocols and system utilities are typically implemented in C++.\n" +
                    "Advantages and disadvantages of C++\n" +
                    "C++ comes with a mix of advantages and disadvantages. Some of its advantages such as high-performance and control come with the challenge of complexity and steep learning curves.\n" +
                    "\n" +
                    "Advantages of C++\n" +
                    "C++ benefits meet developers' many demands of programming languages:\n" +
                    "\n" +
                    "High performance from C++'s low-level memory manipulation and direct access to hardware, making it suitable for resource-intensive applications.\n" +
                    "Control, such as low-level control over system resources, which enables developers to fine-tune their programs for optimal performance.\n" +
                    "Flexibility resulting from functionality such as the support of OOP and procedural and functional programming, the latter of which is increasingly embraced at enterprise scale.\n" +
                    "Software portability that lets programs run on several different platforms.\n" +
                    "Compatibility coming from C++'s interoperability with other programming languages such as C and its support across different platforms. This lets developers reuse code and use third-party libraries.\n" +
                    "An expansive ecosystem tied to C++'s ability to use a large array of libraries and frameworks that offer prebuilt approaches for tasks, such as data manipulation, which reduces the need for manual implementation.\n" +
                    "Disadvantages of C++\n" +
                    "C++ also comes with some disadvantages, including the following:\n" +
                    "\n" +
                    "Complexity and a challenging learning curve for beginners because of its extensive feature set.\n" +
                    "Manual memory management, which can lead to memory leaks and other memory management issues if not handled properly.\n" +
                    "Security risks related to C++'s direct access to memory, which increases risk of writing unsafe code.\n" +
                    "Lack of built-in garbage collection, forcing developers to manually deallocate memory when it's no longer needed.\n" +
                    "Complex syntax compared to other programming languages, making code reading and writing more time-consuming.\n" +
                    "Long compile time compared to languages with dynamic typing or just-in-time compilation.\n" +
                    "Examples of C++ tools\n" +
                    "There are several tools and frameworks for C++ development that can enhance productivity, aid in-code organization and facilitate debugging and testing. Some of those tools include the following:\n" +
                    "\n" +
                    "Integrated development environments. IDEs assist programmers in writing, debugging and managing code. IDEs used for C++ programming include Microsoft Visual Studio, which provides debugging and project management tools; JetBrains CLion, a cross-platform IDE that has refactoring tools; and Eclipse CDT, an open source IDE with code navigation and project management tools.\n" +
                    "Build systems. Build systems help simplify the C++ build process by simplifying platform-specific build scripts and specifying dependencies and commands. Examples of these are CMake and GNU Make, both open source applications.\n" +
                    "Testing frameworks. Testing frameworks let developers write and test code functionality. Google Test is an example of a testing framework that offers a set of assertion macros and utilities. Catch2 is a lightweight framework that provides a syntax for defining test cases, assertions and test fixtures. Boost.Test is a component of the Boost C++ Libraries that supports various testing styles and assertions.\n" +
                    "Profiling tools. Profiling tools help developers analyze code performance using data on bottlenecks, resource use and execution. Valgrind is an open source profiling tool for performance analysis, memory profiling and leak detection. Intel VTune Amplifier is a tool that helps identify bottlenecks.\n" +
                    "Documentation tools. Documentation tools are software utilities that automate the generation of source code documentation. Doxygen is one such tool that uses source code comments to document in Hypertext Markup Language, PDF and other formats.\n" +
                    "Package managers. Package managers help manage a project's dependencies and libraries through a centralized interface. They help developers discover, install, update and remove software packages. Some package managers on the market include JFrog's Conan, a decentralized C/C++ package manager that simplifies dependency management and facilitates the integration of third-party libraries; and vcpkg, a cross-platform manager developed by Microsoft that offers a range of precompiled C++ libraries."
        ),
        InformationData("Java",R.drawable.ic_java,
                "Java is a widely-used programming language for coding web applications. It has been a popular choice among developers for over two decades, with millions of Java applications in use today. Java is a multi-platform, object-oriented, and network-centric language that can be used as a platform in itself. It is a fast, secure, reliable programming language for coding everything from mobile apps and enterprise software to big data applications and server-side technologies.\n" +
                "\n" +
                "What is Java programming language used for?\n" +
                "What is Java programming language used for? \n" +
                "Because Java is a free-to-use and a versatile language, it builds localized and distributed software. Some common uses of Java include:\n" +
                "\n" +
                "1.     Game Development\n" +
                "Many popular mobile, computer, and video games are built in Java. Even modern games that integrate advanced technology like machine learning or virtual reality are built with Java technology.\n" +
                "\n" +
                "2.     Cloud computing\n" +
                "Java is often referred to as WORA – Write Once and Run Anywhere, making it perfect for decentralized cloud-based applications. Cloud providers choose Java language to run programs on a wide range of underlying platforms.\n" +
                "\n" +
                "3.     Big Data\n" +
                "Java is used for data processing engines that can work with complex data sets and massive amounts of real-time data.\n" +
                "\n" +
                "4.     Artificial Intelligence\n" +
                "Java is a powerhouse of machine learning libraries. Its stability and speed make it perfect for artificial intelligence application development like natural language processing and deep learning.\n" +
                "\n" +
                "5.     Internet of Things\n" +
                "Java has been used to program sensors and hardware in edge devices that can connect independently to the internet.\n" +
                "\n" +
                "Why is Java such a popular choice among modern-day software developers?\n" +
                "Java is popular because it has been designed for ease of use. Some reasons developers continue to choose Java over other programming languages include:\n" +
                "\n" +
                "High quality learning resources\n" +
                "Java has been around for a long time, so many learning resources are available for new programmers. Detailed documentation, comprehensive books, and courses support developers through the learning curve. In addition, beginners can start writing code in Core Java before moving to Advanced Java.\n" +
                "\n" +
                "Inbuilt functions and libraries\n" +
                "When using Java, developers don’t need to write every new function from scratch. Instead, Java provides a rich ecosystem of in-built functions and libraries to develop a range of applications. \n" +
                "\n" +
                "Active community support\n" +
                "Java has many active users and a community that can support developers when they face coding challenges. The Java platform software is also maintained and updated regularly.\n" +
                "\n" +
                "High-quality development tools\n" +
                "Java offers various tools to support automated editing, debugging, testing, deployment, and change management. These tools make Java programming time and cost-efficient.\n" +
                "\n" +
                "Platform Independent\n" +
                "Java code can run on any underlying platform like Windows, Linux, iOS, or Android without rewriting. This makes it especially powerful in today’s environment, where we want to run applications on multiple devices.\n" +
                "\n" +
                "Security\n" +
                "Users can download untrusted Java code over a network and run it in a secure environment in which it cannot do any harm. Untrusted code cannot infect the host system with a virus nor can it read or write files from the hard drive. The security levels and restrictions in Java are also highly configurable.\n" +
                "\n" +
                "How does Java work?\n" +
                "All programming languages are a means to communicate with machines. Machine hardware only responds to electronic communication. High-level programming languages like Java act as a bridge between human language and hardware language. To use Java, a developer needs to understand two things:\n" +
                "\n" +
                "1. Java language and APIs\n" +
                "This is the front-end communication between the developer and the Java platform.\n" +
                "\n" +
                "2. Java Virtual Machine\n" +
                "This is the back-end communication between the Java platform and the underlying hardware. Let’s look at each of these in detail below.\n" +
                "\n" +
                "What is Java API?\n" +
                "Java defines the syntax and semantics of the Java programming language. This includes the basic vocabulary and rules used to write algorithms such as primitive data types, if/else blocks, loops, etc.\n" +
                "\n" +
                "APIs are important software components bundled with the Java Platform. These are pre-written Java programs that can plug and play existing functionality into your own code. For example, you could use Java APIs to get the date and time, perform mathematical operations, or manipulate text. \n" +
                "\n" +
                "Any Java application code written by a developer will typically combine new and pre-existing code from Java APIs and Java libraries.\n" +
                "\n" +
                "What is Java Virtual Machine?\n" +
                "The Java Virtual Machine acts as an additional abstraction layer between the Java platform and the underlying machine hardware. Java source code can run only on those machines that have JVM installed on them. The answer to why the Java Virtual Machine is needed lies in the history of programming.\n" +
                "\n" +
                "The history of programming\n" +
                "When natural programming languages were first developed, they fell into two broad categories, depending on how they communicated with the underlying hardware.\n" +
                "\n" +
                "Compilers: The complete program is written in natural English-like syntax with compilers, and the language then compiles (or translates) the entire code into machine code. The compiled code is then run on the hardware.\n" +
                "Interpreters: With interpreters, every high-level code statement is interpreted into machine code on the fly.  Written statements are run immediately by the hardware before looking at the next statement.\n" +
                "The Java runtime environment\n" +
                "The Java program was the first language to combine both methods above using a Java Virtual Machine (JVM). The Java code compiler is called the Java Virtual Machine. Any Java file is first compiled into bytecode. Java bytecode can only run in the JVM. The JVM then interprets the bytecode to run it on the underlying hardware platform. So if the application is running on a Windows machine, the JVM will interpret it for Windows. But if it is running on an open-source platform like Linux, the JVM will interpret it for Linux. \n" +
                "\n" +
                "How to program in Java\n" +
                "To begin programming in Java, you need to install a Java Edition on your system. There are four main Java editions: \n" +
                "\n" +
                "Java Standard Edition (Java SE)\n" +
                "Java Enterprise Edition (Java EE)\n" +
                "Java Micro Edition (Java ME)\n" +
                "What is Java SE?\n" +
                "Java Standard Edition is the core Java programming platform. It contains all of the libraries and APIs that any programmer needs for java development. Open Java Development Kit(OpenJDK) is the free and open source implementation of Java SE.\n" +
                "\n" +
                "Amazon Corretto is a no cost, multiplatform, production-ready distribution of OpenJDK. It can be used as a drop-in replacement for many Java SE distributions and comes with no-cost, long term support from Amazon. It lets you run the same environment in the cloud, on premises, and on your local machine.\n" +
                "\n" +
                "What is AWS SDK for Java?\n" +
                "AWS SDK for Java simpliﬁes uses of AWS Services by providing a set of libraries that are consistent and familiar for Java developers. It supports higher-level abstractions for simplified development. AWS-focused open-source Java libraries are available along with code examples and a Java API reference guide.\n" +
                "\n" +
                "The SDK code examples contain Java code examples and real-world use cases for AWS services to help accelerate the development of your applications. In addition, the Java API reference guide describes the API operations for the latest version of the AWS SDK for Java. The reference guide also provides sample requests, responses, and errors for the supported web services protocols.\n" +
                "\n" +
                "Get started with AWS SDK for Java at the developer guide or visit the AWS Java Developer Center."),
        InformationData("Python",R.drawable.ic_python,"What type of language is Python? Python is an interpreted, object-oriented, high-level programming language with dynamic semantics developed by Guido van Rossum. It was originally released in 1991. Designed to be easy as well as fun, the name \"Python\" is a nod to the British comedy group Monty Python. Python has a reputation as a beginner-friendly language, replacing Java as the most widely used introductory language because it handles much of the complexity for the user, allowing beginners to focus on fully grasping programming concepts rather than minute details.\n" +
                "\n" +
                "Python is used for server-side web development, software development, mathematics, and system scripting, and is popular for Rapid Application Development and as a scripting or glue language to tie existing components because of its high-level, built-in data structures, dynamic typing, and dynamic binding. Program maintenance costs are reduced with Python due to the easily learned syntax and emphasis on readability. Additionally, Python's support of modules and packages facilitates modular programs and reuse of code. Python is an open source community language, so numerous independent programmers are continually building libraries and functionality for it.\n" +
                "\n" +
                "Python Use Cases\n" +
                "\n" +
                "Creating web applications on a server\n" +
                "Building workflows that can be used in conjunction with software\n" +
                "Connecting to database systems\n" +
                "Reading and modifying files\n" +
                "Performing complex mathematics\n" +
                "Processing big data\n" +
                "Fast prototyping\n" +
                "Developing production-ready software\n" +
                " \n" +
                "Professionally, Python is great for backend web development, data analysis, artificial intelligence, and scientific computing. Developers also use Python to build productivity tools, games, and desktop apps.\n" +
                " \n" +
                "Features and Benefits of Python\n" +
                "\n" +
                "Compatible with a variety of platforms including Windows, Mac, Linux, Raspberry Pi, and others\n" +
                "Uses a simple syntax comparable to the English language that lets developers use fewer lines than other programming languages\n" +
                "Operates on an interpreter system that allows code to be executed immediately, fast-tracking prototyping\n" +
                "Can be handled in a procedural, object-orientated, or functional way\n" +
                " \n" +
                "Python Syntax\n" +
                "\n" +
                "Somewhat similar to the English language, with a mathematical influence, Python is built for readability\n" +
                "Unlike other languages that use semicolons and/or parentheses to complete a command, Python uses new lines for the same function\n" +
                "Defines scope (i.e., loops, functions, classes) by relying indentation, using whitespace, rather than braces (aka curly brackets)\n" +
                " \n" +
                "Python Flexibility\n" +
                "Python, a dynamically typed language, is especially flexible, eliminating hard rules for building features and offering more problem-solving flexibility with a variety of methods. It also allows uses to compile and run programs right up to a problematic area because it uses run-time type checking rather than compile-time checking.\n" +
                "\n" +
                "The Less Great Parts of Python\n" +
                "On the down side, Python isn’t easy to maintain. One command can have multiple meanings depending on context because Python is a dynamically typed language. And, maintaining a Python app as it grows in size and complexity can be increasingly difficult, especially finding and fixing errors. Users will need experience to design code or write unit tests that make maintenance easier. \n" +
                " \n" +
                "Speed is another weakness in Python. Its flexibility, because it is dynamically typed, requires a significant amount of referencing to land on a correct definition, slowing performance. This can be mitigated by using alternative implementation of Python (e.g. PyPy).\n" +
                " \n" +
                "Python and AI\n" +
                "AI researchers are fans of Python. Google TensorFlow, as well as other libraries (scikit-learn, Keras), establish a foundation for AI development because of the usability and flexibility it offers Python users. These libraries, and their availability, are critical because they enable developers to focus on growth and building.\n" +
                " \n" +
                "Good to Know\n" +
                "The Python Package Index (PyPI) is a repository of software for the Python programming language. PyPI helps users find and install software developed and shared by the Python community. "),
        InformationData("C",R.drawable.ic_c,"C is a general-purpose programming language that is extremely popular, simple, and flexible to use. It is a structured programming language that is machine-independent and extensively used to write various applications, Operating Systems like Windows, and many other complex programs like Oracle database, Git, Python interpreter, and more.\n" +
                "\n" +
                "It is said that ‘C’ is a god’s programming language. One can say, C is a base for the programming. If you know ‘C,’ you can easily grasp the knowledge of the other programming languages that uses the concept of ‘C’\n" +
                "\n" +
                "It is essential to have a background in computer memory mechanisms because it is an important aspect when dealing with the C programming language.\n" +
                "\n"+"History of C language\n" +
                "The base or father of programming languages is ‘ALGOL.’ It was first introduced in 1960. ‘ALGOL’ was used on a large basis in European countries. ‘ALGOL’ introduced the concept of structured programming to the developer community. In 1967, a new computer programming language was announced called as ‘BCPL’ which stands for Basic Combined Programming Language. BCPL was designed and developed by Martin Richards, especially for writing system software. This was the era of programming languages. Just after three years, in 1970 a new programming language called ‘B’ was introduced by Ken Thompson that contained multiple features of ‘BCPL.’ This programming language was created using UNIX operating system at AT&T and Bell Laboratories. Both the ‘BCPL’ and ‘B’ were system programming languages.\n" +
                "\n" +
                "History of C language\n" +
                "\n" +
                "In 1972, a great computer scientist Dennis Ritchie created a new programming language called ‘C’ at the Bell Laboratories. It was created from ‘ALGOL’, ‘BCPL’ and ‘B’ programming languages. ‘C’ programming language contains all the features of these languages and many more additional concepts that make it unique from other languages.\n" +
                "\n" +
                "‘C’ is a powerful programming language which is strongly associated with the UNIX operating system. Even most of the UNIX operating system is coded in ‘C’. Initially ‘C’ programming was limited to the UNIX operating system, but as it started spreading around the world, it became commercial, and many compilers were released for cross-platform systems. Today ‘C’ runs under a variety of operating systems and hardware platforms. As it started evolving many different versions of the language were released. At times it became difficult for the developers to keep up with the latest version as the systems were running under the older versions. To assure that ‘C’ language will remain standard, American National Standards Institute (ANSI) defined a commercial standard for ‘C’ language in 1989. Later, it was approved by the International Standards Organization (ISO) in 1990. ‘C’ programming language is also called as ‘ANSI C’.\n" +
                "\n"+"C Basic Commands\n" +
                "Following are the basic commands in C programming language:\n" +
                "\n" +
                "C Basic commands\tExplanation\n" +
                "#include <stdio.h>\tThis command includes standard input output header file(stdio.h) from the C library before compiling a C program\n" +
                "int main()\tIt is the main function from where C program execution begins.\n" +
                "{\tIndicates the beginning of the main function.\n" +
                "/*_some_comments_*/\tWhatever written inside this command “/* */” inside a C program, it will not be considered for compilation and execution.\n" +
                "printf(“Hello_World! “);\tThis command prints the output on the screen.\n" +
                "getch();\tThis command is used for any character input from keyboard.\n" +
                "return 0;\t\n" +
                "This command is used to terminate a C program (main function) and it returns 0.\n" +
                "}\t\n" +
                "It is used to indicate the end of the main function."+"Where is C used? Key Applications\n" +
                "‘C’ language is widely used in embedded systems.\n" +
                "It is used for developing system applications.\n" +
                "It is widely used for developing desktop applications.\n" +
                "Most of the applications by Adobe are developed using ‘C’ programming language.\n" +
                "It is used for developing browsers and their extensions. Google’s Chromium is built using ‘C’ programming language.\n" +
                "It is used to develop databases. MySQL is the most popular database software which is built using ‘C’.\n" +
                "It is used in developing an operating system. Operating systems such as Apple’s OS X, Microsoft’s Windows, and Symbian are developed using ‘C’ language. It is used for developing desktop as well as mobile phone’s operating system.\n" +
                "It is used for compiler production.\n" +
                "It is widely used in IOT applications.\n" +
                "Why learn C Language?\n" +
                "As we studied earlier, ‘C’ is a base language for many programming languages. So, learning ‘C’ as the main language will play an important role while studying other programming languages. It shares the same concepts such as data types, operators, control statements and many more. ‘C’ can be used widely in various applications. It is a simple language and provides faster execution. There are many jobs available for a ‘C’ developer in the current market.\n" +
                "\n" +
                "‘C’ is a structured programming language in which program is divided into various modules. Each module can be written separately and together it forms a single ‘C’ program. This structure makes it easy for testing, maintaining and debugging processes.\n" +
                "\n" +
                "‘C’ contains 32 keywords, various data types and a set of powerful built-in functions that make programming very efficient.\n" +
                "\n" +
                "Another feature of ‘C’ programming is that it can extend itself. A ‘C’ program contains various functions which are part of a library. We can add our features and functions to the library. We can access and use these functions anytime we want in our program. This feature makes it simple while working with complex programming.\n" +
                "\n" +
                "Various compilers are available in the market that can be used for executing programs written in this language.\n" +
                "\n" +
                "It is a highly portable language which means programs written in ‘C’ language can run on other machines. This feature is essential if we wish to use or execute the code on another computer."),

        InformationData("C#",R.drawable.ic_c_shab,"C# Programming: What It Is, How It's Used + How to Learn It\n" +
                "Written by Coursera Staff • Updated on Feb 23, 2024\n" +
                "In this article, learn about programming with C#, including what it is, careers where C# skills are valuable, and how you can learn.\n" +
                "\n" +
                "[Featured image] A Coursera learner is sitting on an office desk. \n" +
                "C#, pronounced “C sharp,” is a general-purpose, object-oriented programming language used to develop a wide range of programs, including enterprise software, video games, and mobile apps.\n" +
                "\n" +
                "Introduced by Microsoft in 2002 with its release of Visual Studio .NET, C# is part of the C family of languages, which also includes C and C++. C# is the most modern of the three and is easy to learn since it’s a high-level programming language. \n" +
                "\n" +
                "In this article, you'll learn more about C#, including what it is, its applications, and jobs that commonly use it. Later, you'll explore how you can learn C# yourself and find suggested, online courses that can help you start building your knowledge of C# today.\n" +
                "\n" +
                "What is C#?\n" +
                "C# is a versatile, high-level object-oriented programming language that runs on open-source platforms, as well as Microsoft Windows .NET architecture.\n" +
                "\n" +
                "Several attributes are responsible for the popularity of C#, as it’s especially advantageous for building different types of web-based applications. This is largely because of C#’s ability to create interactive environments for users.\n" +
                "\n" +
                "C# is also popular due to how easy it is to learn compared to some other programming languages. In fact, while C# has similarities to C and C++, programmers with experience in JavaScript or Java often find commonalities with the language. Furthermore, high-level programming languages are often easier to learn because commands utilize words similar to everyday language rather than complex code.\n" +
                "\n" +
                "Read more: C# vs. Java: Which to Choose?\n" +
                "On Coursera, you can find highly-rated courses to develop your skills in several different programming languages, including C#. Learn the basics of C# programming in the project-based course Programming in C#: A Comprehensive Approach to C# Fundamentals.\n" +
                "\n" +
                "\n" +
                "What is object-oriented programming?\n" +
                "Object-oriented programming (OOP) is a type of programming paradigm in which software is designed around classes and data structures (called \"objects\") rather than through logic and functions. When using OOP, programmers first collect all of a program's objects, and then they define how they all relate to one another (a process called \"data modeling\"). Objects are identified by their \"class,\" which indicates the type of data contained within them and any associated logical sequences.\n" +
                "\n" +
                "Their relative ease of use, scalability, and wide range of use cases have made object-oriented programming languages broadly popular today. Some examples of object-oriented programming languages, include Java, Python, Ruby, and C#. Typically, OOP languages share four main features: encapsulation, inheritance, abstraction, and polymorphism. Here’s a closer look at what each of these means:\n" +
                "\n" +
                "Encapsulation: Encapsulation creates modules where data is enclosed or encapsulated within an object. This allows the details of data to stay private, with specific rules in place that only allow visibility of essential components.\n" +
                "\n" +
                "Inheritance: When a new class is created in object-oriented programming, it inherits the structures and functions of its parent class. This allows programmers to sort classes hierarchically and reuse code. \n" +
                "\n" +
                "Abstraction: Abstraction in object-oriented programming makes it easier for programmers to access objects by using classes. Classes have their own implementation details, and with abstraction, programmers can identify these details, making it easier to manage their code. \n" +
                "\n" +
                "Polymorphism: Polymorphism allows objects in a hierarchical class to share the same functions as its parent class. This also enables various objects to interact with the same interface. \n" +
                "\n" +
                "Read more: Should You Learn Object-Oriented Programming Languages?\n" +
                "Benefits of the C# programming language\n" +
                "C# has several advantageous features that help make it a popular programming language. While it’s comparatively easy to learn, especially if you’re familiar with other C languages, C# can be used to develop many different types of applications, software, and platforms. Here are a few factors that make C# a popular programming language: \n" +
                "\n" +
                "Faster development. C# has features that help shorten your development time, with efficient and simple code that isn’t challenging to read to help limit time spent debugging.\n" +
                "\n" +
                "Large community. C# is used worldwide, and C# developers are ready to help if you’re having trouble with your code.\n" +
                "\n" +
                "High scalability. This makes it easier for you to maintain and expand your projects. \n" +
                "\n" +
                "C# vs C++\n" +
                "C# and C++ are both part of the same family of programming languages. But, that doesn't mean they're the same.\n" +
                "\n" +
                "C++ is a low-level programming language that compiles to machine code and requires programmers to manage memory manually. C#, on the other hand, is a high-level programming language that compiles to Common Language Runtime (CLR) and automatically handles memory management. Read more: What Is C++? (And How to Learn It)\n" +
                "\n" +
                "\n" +
                "What is C# used for? Applications and jobs\n" +
                "There are many different uses for C# in the world of development. In fact, as one of the more popular programming languages, hiring managers regularly seek out developers proficient in C#. Below, we explore the different uses of C# and some of the careers that might require you to possess knowledge of it.\n" +
                "\n" +
                "1. Web development\n" +
                "Web developers use C# to build dynamic web pages and applications.\n" +
                "\n" +
                "When pursuing a career in web development, you generally have three options: front-end, back-end, and full-stack development. Front-end developers ensure websites are easy to use for end users, while back-end developers handle the server side of web applications, such as a website's databases. Full-stack developers perform the duties of both front and back-end developers.\n" +
                "\n" +
                "At a glance, here's what each of these positions pays, according to Glassdoor [1,2,3]:\n" +
                "\n" +
                "Front-end developer\t\$83,269\n" +
                "Back-end developer\t\$92,916\n" +
                "Full-stack developer\t\$90,697\n" +
                "2. Game development\n" +
                "C# is a popular programming language in game development due to its overall efficiency and compatibility with the Unity game engine.\n" +
                "\n" +
                "Game developers build the software that makes video games, including the different visuals, sounds, and artificial intelligence (AI) needed for non-character players. As a video game developer, it’s your job to take the vision and ideas of video game designers and make them real using programming skills.\n" +
                "\n" +
                "Some of the video game careers (and salaries) that you might qualify for with proficient C# skills include [4,5]:\n" +
                "\n" +
                "Game developer\t\$90,752\n" +
                "Game programmer\t\$84,655"+"3. Windows applications\n" +
                "As a programming language originally developed by Microsoft, C# can be used to build all kinds of different Windows applications. For example, this means you can develop applications designed specifically for Windows platforms, such as Microsoft Office.\n" +
                "\n" +
                "At a glance, here are job titles and average salaries for roles centered around developing Windows platforms [6,7]:\n" +
                "\n" +
                "Windows developer\t\$107,817\n" +
                "Windows application developer\t\$118,929\n" +
                "How to learn C#: Courses, boot camps, and degrees\n" +
                "When learning how to code, you have several options, including online courses, bootcamps, or through degree programs for a college or university. When deciding how you want to approach learning C#, you should consider factors such as your timeline and financial commitment. \n" +
                "\n" +
                "Online courses\n" +
                "You can gain an introduction to C# by taking online courses where you can learn at your own pace. Free courses are available and are a great option when you aren’t ready to make a significant financial or time commitment. However, keep in mind that they may not offer the same level of resources as paid courses.\n" +
                "\n" +
                "Boot camps\n" +
                "Boot camps can help you quickly gain relevant skills in typically three to six months. Although boot camps are shorter than degree programs, they focus on helping you learn the practical skills you'll need to succeed. These programs will also provide support and guidance from an instructor. Another advantage of boot camps is that you can work on projects to add to your portfolio to demonstrate your skills to employers.\n" +
                "\n" +
                "Read more: Coding Bootcamps: Options, Benefits, Requirements, and More\n" +
                "Degree programs\n" +
                "It’s common for those with careers in programming to have a degree in computer science or a related field. While going to college or a university is a significant time and financial commitment, you can learn coding skills, as well as theoretical concepts. However, if you’ve already earned a degree in an unrelated field, it may be more practical to pursue other options, such as a boot camp, rather than returning to school.\n" +
                "\n" +
                "Explore online c# courses today\n" +
                "Interested in building your knowledge of c# and other programming languages? Explore Coursera's catalog today.\n" +
                "\n" +
                "In the University of Colorado Boulder's C# Programming for Unity Game Development Specialization, you'll learn how to program in C# and how to use that C# knowledge to program Unity games. No prior experience is required.\n" +
                "\n" +
                "In Duke University's Introductory C Programming Specialization, you'll learn to develop algorithms in a systematic way as well as how to read, write, and implement C code."),
        InformationData("JavaScript",R.drawable.ic_java_script,"Welcome to the MDN beginner's JavaScript course! In this article we will look at JavaScript from a high level, answering questions such as \"What is it?\" and \"What can you do with it?\", and making sure you are comfortable with JavaScript's purpose.\n" +
                "\n" +
                "Prerequisites:\tA basic understanding of HTML and CSS.\n" +
                "Objective:\tTo gain familiarity with what JavaScript is, what it can do, and how it fits into a website.\n" +
                "A high-level definition\n" +
                "JavaScript is a scripting or programming language that allows you to implement complex features on web pages — every time a web page does more than just sit there and display static information for you to look at — displaying timely content updates, interactive maps, animated 2D/3D graphics, scrolling video jukeboxes, etc. — you can bet that JavaScript is probably involved. It is the third layer of the layer cake of standard web technologies, two of which (HTML and CSS) we have covered in much more detail in other parts of the Learning Area.\n" +
                "\n" +
                "The three layers of standard web technologies; HTML, CSS and JavaScript\n" +
                "HTML is the markup language that we use to structure and give meaning to our web content, for example defining paragraphs, headings, and data tables, or embedding images and videos in the page.\n" +
                "CSS is a language of style rules that we use to apply styling to our HTML content, for example setting background colors and fonts, and laying out our content in multiple columns.\n" +
                "JavaScript is a scripting language that enables you to create dynamically updating content, control multimedia, animate images, and pretty much everything else. (Okay, not everything, but it is amazing what you can achieve with a few lines of JavaScript code.)\n" +
                "The three layers build on top of one another nicely. Let's take a button as an example. We can mark it up using HTML to give it structure and purpose:\n" +
                "\n" +
                "HTML\n" +
                "Play\n" +
                "Copy to Clipboard\n" +
                "<button type=\"button\">Player 1: Chris</button>\n" +
                "Button showing Player 1: Chris with no styling\n" +
                "Then we can add some CSS into the mix to get it looking nice:\n" +
                "\n" +
                "CSS\n" +
                "Play\n" +
                "Copy to Clipboard\n" +
                "button {\n" +
                "  font-family: \"helvetica neue\", helvetica, sans-serif;\n" +
                "  letter-spacing: 1px;\n" +
                "  text-transform: uppercase;\n" +
                "  border: 2px solid rgb(200 200 0 / 60%);\n" +
                "  background-color: rgb(0 217 217 / 60%);\n" +
                "  color: rgb(100 0 0 / 100%);\n" +
                "  box-shadow: 1px 1px 2px rgb(0 0 200 / 40%);\n" +
                "  border-radius: 10px;\n" +
                "  padding: 3px 10px;\n" +
                "  cursor: pointer;\n" +
                "}\n" +
                "Button showing Player 1: Chris with styling\n" +
                "And finally, we can add some JavaScript to implement dynamic behavior:\n" +
                "\n" +
                "JS\n" +
                "Play\n" +
                "Copy to Clipboard\n" +
                "const button = document.querySelector(\"button\");\n" +
                "\n" +
                "button.addEventListener(\"click\", updateName);\n" +
                "\n" +
                "function updateName() {\n" +
                "  const name = prompt(\"Enter a new name\");\n" +
                "  button.textContent = `Player 1: {name}`;\n" +
                "}\n" +
                "Play\n" +
                "\n" +
                "Try clicking on this last version of the text label to see what happens (note also that you can find this demo on GitHub — see the source code, or run it live)!\n" +
                "\n" +
                "JavaScript can do a lot more than that — let's explore what in more detail.\n" +
                "\n" +
                "So what can it really do?\n" +
                "The core client-side JavaScript language consists of some common programming features that allow you to do things like:\n" +
                "\n" +
                "Store useful values inside variables. In the above example for instance, we ask for a new name to be entered then store that name in a variable called name.\n" +
                "Operations on pieces of text (known as \"strings\" in programming). In the above example we take the string \"Player 1: \" and join it to the name variable to create the complete text label, e.g. \"Player 1: Chris\".\n" +
                "Running code in response to certain events occurring on a web page. We used a click event in our example above to detect when the label is clicked and then run the code that updates the text label.\n" +
                "And much more!\n" +
                "What is even more exciting however is the functionality built on top of the client-side JavaScript language. So-called Application Programming Interfaces (APIs) provide you with extra superpowers to use in your JavaScript code.\n" +
                "\n" +
                "APIs are ready-made sets of code building blocks that allow a developer to implement programs that would otherwise be hard or impossible to implement. They do the same thing for programming that ready-made furniture kits do for home building — it is much easier to take ready-cut panels and screw them together to make a bookshelf than it is to work out the design yourself, go and find the correct wood, cut all the panels to the right size and shape, find the correct-sized screws, and then put them together to make a bookshelf.\n" +
                "\n" +
                "They generally fall into two categories.\n" +
                "\n" +
                "Two categories of API; 3rd party APIs are shown to the side of the browser and browser APIs are in the browser\n" +
                "Browser APIs are built into your web browser, and are able to expose data from the surrounding computer environment, or do useful complex things. For example:\n" +
                "\n" +
                "The DOM (Document Object Model) API allows you to manipulate HTML and CSS, creating, removing and changing HTML, dynamically applying new styles to your page, etc. Every time you see a popup window appear on a page, or some new content displayed (as we saw above in our simple demo) for example, that's the DOM in action.\n" +
                "The Geolocation API retrieves geographical information. This is how Google Maps is able to find your location and plot it on a map.\n" +
                "The Canvas and WebGL APIs allow you to create animated 2D and 3D graphics. People are doing some amazing things using these web technologies — see Chrome Experiments and webglsamples.\n" +
                "Audio and Video APIs like HTMLMediaElement and WebRTC allow you to do really interesting things with multimedia, such as play audio and video right in a web page, or grab video from your web camera and display it on someone else's computer (try our simple Snapshot demo to get the idea).\n" +
                "Note: Many of the above demos won't work in an older browser — when experimenting, it's a good idea to use a modern browser like Firefox, Chrome, Edge or Opera to run your code in. You will need to consider cross browser testing in more detail when you get closer to delivering production code (i.e. real code that real customers will use).\n" +
                "\n" +
                "Third party APIs are not built into the browser by default, and you generally have to grab their code and information from somewhere on the Web. For example:\n" +
                "\n" +
                "The Twitter API allows you to do things like displaying your latest tweets on your website.\n" +
                "The Google Maps API and OpenStreetMap API allows you to embed custom maps into your website, and other such functionality.\n" +
                "Note: These APIs are advanced, and we'll not be covering any of these in this module. You can find out much more about these in our Client-side web APIs module.\n" +
                "\n" +
                "There's a lot more available, too! However, don't get over excited just yet. You won't be able to build the next Facebook, Google Maps, or Instagram after studying JavaScript for 24 hours — there are a lot of basics to cover first. And that's why you're here — let's move on!\n" +
                "\n" +
                "What is JavaScript doing on your page?\n" +
                "Here we'll actually start looking at some code, and while doing so, explore what actually happens when you run some JavaScript in your page.\n" +
                "\n" +
                "Let's briefly recap the story of what happens when you load a web page in a browser (first talked about in our How CSS works article). When you load a web page in your browser, you are running your code (the HTML, CSS, and JavaScript) inside an execution environment (the browser tab). This is like a factory that takes in raw materials (the code) and outputs a product (the web page).\n" +
                "\n" +
                "HTML, CSS and JavaScript code come together to create the content in the browser tab when the page is loaded\n" +
                "A very common use of JavaScript is to dynamically modify HTML and CSS to update a user interface, via the Document Object Model API (as mentioned above). Note that the code in your web documents is generally loaded and executed in the order it appears on the page. Errors may occur if JavaScript is loaded and run before the HTML and CSS that it is intended to modify. You will learn ways around this later in the article, in the Script loading strategies section.\n" +
                "\n" +
                "Browser security\n" +
                "Each browser tab has its own separate bucket for running code in (these buckets are called \"execution environments\" in technical terms) — this means that in most cases the code in each tab is run completely separately, and the code in one tab cannot directly affect the code in another tab — or on another website. This is a good security measure — if this were not the case, then pirates could start writing code to steal information from other websites, and other such bad things.\n" +
                "\n" +
                "Note: There are ways to send code and data between different websites/tabs in a safe manner, but these are advanced techniques that we won't cover in this course.\n" +
                "\n" +
                "JavaScript running order\n" +
                "When the browser encounters a block of JavaScript, it generally runs it in order, from top to bottom. This means that you need to be careful what order you put things in. For example, let's return to the block of JavaScript we saw in our first example:\n" +
                "\n" +
                "JS\n" +
                "Copy to Clipboard\n" +
                "const button = document.querySelector(\"button\");\n" +
                "\n" +
                "button.addEventListener(\"click\", updateName);\n" +
                "\n" +
                "function updateName() {\n" +
                "  const name = prompt(\"Enter a new name\");\n" +
                "  button.textContent = `Player 1: {name}`;\n" +
                "}\n" +
                "Here we are selecting a button (line 1), then attaching an event listener to it (line 3) so that when the button is clicked, the updateName() code block (lines 5–8) is run. The updateName() code block (these types of reusable code blocks are called \"functions\") asks the user for a new name, and then inserts that name into the button text to update the display.\n" +
                "\n" +
                "If you swapped the order of the first two lines of code, it would no longer work — instead, you'd get an error returned in the browser developer console — Uncaught ReferenceError: Cannot access 'button' before initialization. This means that the button object has not been initialized yet, so we can't add an event listener to it.\n" +
                "\n" +
                "Note: This is a very common error — you need to be careful that the objects referenced in your code exist before you try to do stuff to them.\n" +
                "\n" +
                "Interpreted versus compiled code\n" +
                "You might hear the terms interpreted and compiled in the context of programming. In interpreted languages, the code is run from top to bottom and the result of running the code is immediately returned. You don't have to transform the code into a different form before the browser runs it. The code is received in its programmer-friendly text form and processed directly from that.\n" +
                "\n" +
                "Compiled languages on the other hand are transformed (compiled) into another form before they are run by the computer. For example, C/C++ are compiled into machine code that is then run by the computer. The program is executed from a binary format, which was generated from the original program source code.\n" +
                "\n" +
                "JavaScript is a lightweight interpreted programming language. The web browser receives the JavaScript code in its original text form and runs the script from that. From a technical standpoint, most modern JavaScript interpreters actually use a technique called just-in-time compiling to improve performance; the JavaScript source code gets compiled into a faster, binary format while the script is being used, so that it can be run as quickly as possible. However, JavaScript is still considered an interpreted language, since the compilation is handled at run time, rather than ahead of time.\n" +
                "\n" +
                "There are advantages to both types of language, but we won't discuss them right now.\n" +
                "\n" +
                "Server-side versus client-side code\n" +
                "You might also hear the terms server-side and client-side code, especially in the context of web development. Client-side code is code that is run on the user's computer — when a web page is viewed, the page's client-side code is downloaded, then run and displayed by the browser. In this module we are explicitly talking about client-side JavaScript.\n" +
                "\n" +
                "Server-side code on the other hand is run on the server, then its results are downloaded and displayed in the browser. Examples of popular server-side web languages include PHP, Python, Ruby, ASP.NET, and even JavaScript! JavaScript can also be used as a server-side language, for example in the popular Node.js environment — you can find out more about server-side JavaScript in our Dynamic Websites – Server-side programming topic.\n" +
                "\n" +
                "Dynamic versus static code\n" +
                "The word dynamic is used to describe both client-side JavaScript, and server-side languages — it refers to the ability to update the display of a web page/app to show different things in different circumstances, generating new content as required. Server-side code dynamically generates new content on the server, e.g. pulling data from a database, whereas client-side JavaScript dynamically generates new content inside the browser on the client, e.g. creating a new HTML table, filling it with data requested from the server, then displaying the table in a web page shown to the user. The meaning is slightly different in the two contexts, but related, and both approaches (server-side and client-side) usually work together.\n" +
                "\n" +
                "A web page with no dynamically updating content is referred to as static — it just shows the same content all the time.\n" +
                "\n" +
                "How do you add JavaScript to your page?\n" +
                "JavaScript is applied to your HTML page in a similar manner to CSS. Whereas CSS uses <link> elements to apply external stylesheets and <style> elements to apply internal stylesheets to HTML, JavaScript only needs one friend in the world of HTML — the <script> element. Let's learn how this works.\n" +
                "\n" +
                "Internal JavaScript\n" +
                "First of all, make a local copy of our example file apply-javascript.html. Save it in a directory somewhere sensible.\n" +
                "Open the file in your web browser and in your text editor. You'll see that the HTML creates a simple web page containing a clickable button.\n" +
                "Next, go to your text editor and add the following in your head — just before your closing </head> tag:\n" +
                "HTML\n" +
                "Copy to Clipboard\n" +
                "<script>\n" +
                "  // JavaScript goes here\n" +
                "</script>\n" +
                "Now we'll add some JavaScript inside our <script> element to make the page do something more interesting — add the following code just below the \"// JavaScript goes here\" line:\n" +
                "JS\n" +
                "Copy to Clipboard\n" +
                "document.addEventListener(\"DOMContentLoaded\", () => {\n" +
                "  function createParagraph() {\n" +
                "    const para = document.createElement(\"p\");\n" +
                "    para.textContent = \"You clicked the button!\";\n" +
                "    document.body.appendChild(para);\n" +
                "  }\n" +
                "\n" +
                "  const buttons = document.querySelectorAll(\"button\");\n" +
                "\n" +
                "  for (const button of buttons) {\n" +
                "    button.addEventListener(\"click\", createParagraph);\n" +
                "  }\n" +
                "});\n" +
                "Save your file and refresh the browser — now you should see that when you click the button, a new paragraph is generated and placed below.\n" +
                "Note: If your example doesn't seem to work, go through the steps again and check that you did everything right. Did you save your local copy of the starting code as a .html file? Did you add your <script> element just before the </head> tag? Did you enter the JavaScript exactly as shown? JavaScript is case sensitive, and very fussy, so you need to enter the syntax exactly as shown, otherwise it may not work.\n" +
                "\n" +
                "Note: You can see this version on GitHub as apply-javascript-internal.html (see it live too).\n" +
                "\n" +
                "External JavaScript\n" +
                "This works great, but what if we wanted to put our JavaScript in an external file? Let's explore this now.\n" +
                "\n" +
                "First, create a new file in the same directory as your sample HTML file. Call it script.js — make sure it has that .js filename extension, as that's how it is recognized as JavaScript.\n" +
                "Replace your current <script> element with the following:\n" +
                "HTML\n" +
                "Copy to Clipboard\n" +
                "<script src=\"script.js\" defer></script>\n" +
                "Inside script.js, add the following script:\n" +
                "JS\n" +
                "Copy to Clipboard\n" +
                "function createParagraph() {\n" +
                "  const para = document.createElement(\"p\");\n" +
                "  para.textContent = \"You clicked the button!\";\n" +
                "  document.body.appendChild(para);\n" +
                "}\n" +
                "\n" +
                "const buttons = document.querySelectorAll(\"button\");\n" +
                "\n" +
                "for (const button of buttons) {\n" +
                "  button.addEventListener(\"click\", createParagraph);\n" +
                "}\n" +
                "Save and refresh your browser, and you should see the same thing! It works just the same, but now we've got our JavaScript in an external file. This is generally a good thing in terms of organizing your code and making it reusable across multiple HTML files. Plus, the HTML is easier to read without huge chunks of script dumped in it.\n" +
                "Note: You can see this version on GitHub as apply-javascript-external.html and script.js (see it live too).\n" +
                "\n" +
                "Inline JavaScript handlers\n" +
                "Note that sometimes you'll come across bits of actual JavaScript code living inside HTML. It might look something like this:\n" +
                "\n" +
                "JS\n" +
                "Play\n" +
                "Copy to Clipboard\n" +
                "function createParagraph() {\n" +
                "  const para = document.createElement(\"p\");\n" +
                "  para.textContent = \"You clicked the button!\";\n" +
                "  document.body.appendChild(para);\n" +
                "}\n" +
                "HTML\n" +
                "Play\n" +
                "Copy to Clipboard\n" +
                "<button onclick=\"createParagraph()\">Click me!</button>\n" +
                "You can try this version of our demo below.\n" +
                "\n" +
                "Play\n" +
                "\n" +
                "This demo has exactly the same functionality as in the previous two sections, except that the <button> element includes an inline onclick handler to make the function run when the button is pressed.\n" +
                "\n" +
                "Please don't do this, however. It is bad practice to pollute your HTML with JavaScript, and it is inefficient — you'd have to include the onclick=\"createParagraph()\" attribute on every button you want the JavaScript to apply to.\n" +
                "\n" +
                "Using addEventListener instead\n" +
                "Instead of including JavaScript in your HTML, use a pure JavaScript construct. The querySelectorAll() function allows you to select all the buttons on a page. You can then loop through the buttons, assigning a handler for each using addEventListener(). The code for this is shown below:\n" +
                "\n" +
                "JS\n" +
                "Copy to Clipboard\n" +
                "const buttons = document.querySelectorAll(\"button\");\n" +
                "\n" +
                "for (const button of buttons) {\n" +
                "  button.addEventListener(\"click\", createParagraph);\n" +
                "}\n" +
                "This might be a bit longer than the onclick attribute, but it will work for all buttons — no matter how many are on the page, nor how many are added or removed. The JavaScript does not need to be changed.\n" +
                "\n" +
                "Note: Try editing your version of apply-javascript.html and add a few more buttons into the file. When you reload, you should find that all of the buttons when clicked will create a paragraph. Neat, huh?\n" +
                "\n" +
                "Script loading strategies\n" +
                "There are a number of issues involved with getting scripts to load at the right time. Nothing is as simple as it seems! A common problem is that all the HTML on a page is loaded in the order in which it appears. If you are using JavaScript to manipulate elements on the page (or more accurately, the Document Object Model), your code won't work if the JavaScript is loaded and parsed before the HTML you are trying to do something to.\n" +
                "\n" +
                "In the above code examples, in the internal and external examples the JavaScript is loaded and run in the head of the document, before the HTML body is parsed. This could cause an error, so we've used some constructs to get around it.\n" +
                "\n" +
                "In the internal example, you can see this structure around the code:\n" +
                "\n" +
                "JS\n" +
                "Copy to Clipboard\n" +
                "document.addEventListener(\"DOMContentLoaded\", () => {\n" +
                "  // …\n" +
                "});\n" +
                "This is an event listener, which listens for the browser's DOMContentLoaded event, which signifies that the HTML body is completely loaded and parsed. The JavaScript inside this block will not run until after that event is fired, therefore the error is avoided (you'll learn about events later in the course).\n" +
                "\n" +
                "In the external example, we use a more modern JavaScript feature to solve the problem, the defer attribute, which tells the browser to continue downloading the HTML content once the <script> tag element has been reached.\n" +
                "\n" +
                "HTML\n" +
                "Copy to Clipboard\n" +
                "<script src=\"script.js\" defer></script>\n" +
                "In this case both the script and the HTML will load simultaneously and the code will work.\n" +
                "\n" +
                "Note: In the external case, we did not need to use the DOMContentLoaded event because the defer attribute solved the problem for us. We didn't use the defer solution for the internal JavaScript example because defer only works for external scripts.\n" +
                "\n" +
                "An old-fashioned solution to this problem used to be to put your script element right at the bottom of the body (e.g. just before the </body> tag), so that it would load after all the HTML has been parsed. The problem with this solution is that loading/parsing of the script is completely blocked until the HTML DOM has been loaded. On larger sites with lots of JavaScript, this can cause a major performance issue, slowing down your site.\n" +
                "\n" +
                "async and defer\n" +
                "There are actually two modern features we can use to bypass the problem of the blocking script — async and defer (which we saw above). Let's look at the difference between these two.\n" +
                "\n" +
                "Scripts loaded using the async attribute will download the script without blocking the page while the script is being fetched. However, once the download is complete, the script will execute, which blocks the page from rendering. This means that the rest of the content on the web page is prevented from being processed and displayed to the user until the script finishes executing. You get no guarantee that scripts will run in any specific order. It is best to use async when the scripts in the page run independently from each other and depend on no other script on the page.\n" +
                "\n" +
                "Scripts loaded with the defer attribute will load in the order they appear on the page. They won't run until the page content has all loaded, which is useful if your scripts depend on the DOM being in place (e.g. they modify one or more elements on the page).\n" +
                "\n" +
                "Here is a visual representation of the different script loading methods and what that means for your page:\n" +
                "\n" +
                "How the three script loading method work: default has parsing blocked while JavaScript is fetched and executed. With async, the parsing pauses for execution only. With defer, parsing isn't paused, but execution on happens after everything is else is parsed.\n" +
                "This image is from the HTML spec, copied and cropped to a reduced version, under CC BY 4.0 license terms.\n" +
                "\n" +
                "For example, if you have the following script elements:\n" +
                "\n" +
                "HTML\n" +
                "Copy to Clipboard\n" +
                "<script async src=\"js/vendor/jquery.js\"></script>\n" +
                "\n" +
                "<script async src=\"js/script2.js\"></script>\n" +
                "\n" +
                "<script async src=\"js/script3.js\"></script>\n" +
                "You can't rely on the order the scripts will load in. jquery.js may load before or after script2.js and script3.js and if this is the case, any functions in those scripts depending on jquery will produce an error because jquery will not be defined at the time the script runs.\n" +
                "\n" +
                "async should be used when you have a bunch of background scripts to load in, and you just want to get them in place as soon as possible. For example, maybe you have some game data files to load, which will be needed when the game actually begins, but for now you just want to get on with showing the game intro, titles, and lobby, without them being blocked by script loading.\n" +
                "\n" +
                "Scripts loaded using the defer attribute (see below) will run in the order they appear in the page and execute them as soon as the script and content are downloaded:\n" +
                "\n" +
                "HTML\n" +
                "Copy to Clipboard\n" +
                "<script defer src=\"js/vendor/jquery.js\"></script>\n" +
                "\n" +
                "<script defer src=\"js/script2.js\"></script>\n" +
                "\n" +
                "<script defer src=\"js/script3.js\"></script>\n" +
                "In the second example, we can be sure that jquery.js will load before script2.js and script3.js and that script2.js will load before script3.js. They won't run until the page content has all loaded, which is useful if your scripts depend on the DOM being in place (e.g. they modify one or more elements on the page).\n" +
                "\n" +
                "To summarize:\n" +
                "\n" +
                "async and defer both instruct the browser to download the script(s) in a separate thread, while the rest of the page (the DOM, etc.) is downloading, so the page loading is not blocked during the fetch process.\n" +
                "scripts with an async attribute will execute as soon as the download is complete. This blocks the page and does not guarantee any specific execution order.\n" +
                "scripts with a defer attribute will load in the order they are in and will only execute once everything has finished loading.\n" +
                "If your scripts should be run immediately and they don't have any dependencies, then use async.\n" +
                "If your scripts need to wait for parsing and depend on other scripts and/or the DOM being in place, load them using defer and put their corresponding <script> elements in the order you want the browser to execute them.\n" +
                "Comments\n" +
                "As with HTML and CSS, it is possible to write comments into your JavaScript code that will be ignored by the browser, and exist to provide instructions to your fellow developers on how the code works (and you, if you come back to your code after six months and can't remember what you did). Comments are very useful, and you should use them often, particularly for larger applications. There are two types:\n" +
                "\n" +
                "A single line comment is written after a double forward slash (//), e.g.\n" +
                "JS\n" +
                "Copy to Clipboard\n" +
                "// I am a comment\n" +
                "A multi-line comment is written between the strings /* and */, e.g.\n" +
                "JS\n" +
                "Copy to Clipboard\n" +
                "/*\n" +
                "  I am also\n" +
                "  a comment\n" +
                "*/\n" +
                "So for example, we could annotate our last demo's JavaScript with comments like so:\n" +
                "\n" +
                "JS\n" +
                "Copy to Clipboard\n" +
                "// Function: creates a new paragraph and appends it to the bottom of the HTML body.\n" +
                "\n" +
                "function createParagraph() {\n" +
                "  const para = document.createElement(\"p\");\n" +
                "  para.textContent = \"You clicked the button!\";\n" +
                "  document.body.appendChild(para);\n" +
                "}\n" +
                "\n" +
                "/*\n" +
                "  1. Get references to all the buttons on the page in an array format.\n" +
                "  2. Loop through all the buttons and add a click event listener to each one.\n" +
                "\n" +
                "  When any button is pressed, the createParagraph() function will be run.\n" +
                "*/\n" +
                "\n" +
                "const buttons = document.querySelectorAll(\"button\");\n" +
                "\n" +
                "for (const button of buttons) {\n" +
                "  button.addEventListener(\"click\", createParagraph);\n" +
                "}\n" +
                "Note: In general more comments are usually better than less, but you should be careful if you find yourself adding lots of comments to explain what variables are (your variable names perhaps should be more intuitive), or to explain very simple operations (maybe your code is overcomplicated).\n" +
                "\n" +
                "Summary\n" +
                "So there you go, your first step into the world of JavaScript. We've begun with just theory, to start getting you used to why you'd use JavaScript and what kind of things you can do with it. Along the way, you saw a few code examples and learned how JavaScript fits in with the rest of the code on your website, amongst other things.\n" +
                "\n" +
                "JavaScript may seem a bit daunting right now, but don't worry — in this course, we will take you through it in simple steps that will make sense going forward. In the next article, we will plunge straight into the practical, getting you to jump straight in and build your own JavaScript examples."),
        InformationData("PHP",R.drawable.ic_php,"PHP is an open-source, server-side programming language that can be used to create websites, applications, customer relationship management systems and more. It is a widely-used general-purpose language that can be embedded into HTML. This functionality with HTML means that the PHP language has remained popular with developers as it helps to simplify HTML code.\n" +
                "\n" +
                "What does PHP stand for?\n" +
                "PHP stands for ‘PHP: Hypertext Preprocessor’, with the original PHP within this standing for ‘Personal Home Page’. The acronym has changed as the language developed since its launch in 1994 to more accurately reflect its nature. \n" +
                "\n" +
                "Since its release, there have been 8 versions of PHP, as of 2022, with version 8.1 currently a popular choice among those using the language on their websites.\n" +
                "\n" +
                "What is PHP used for? \n" +
                "PHP programming can be used to create most things that a software developer needs. However, there are three main areas in which it thrives.\n" +
                "\n" +
                "Server-side scripting\n" +
                "Server-side Script is PHP’s main strength. If you are just learning to code and want to explore server-side scripting, PHP is a great language to learn. To get cracking with PHP server-side scripting you’ll need to have a PHP parser, web server and web browser.\n" +
                "Command-line scripting \n" +
                "Command-line scripting is ideal for scripts made using cron (Linux) or Task Scheduler (Windows). It is also great for simple text processing.\n" +
                "Writing desktop applications\n" +
                "PHP is probably not the best language to use to create desktop applications but for the advanced web developer, it provides you with many more options than its competitors.\n" +
                "Of course, PHP can do many other things. For example, it is excellent at collecting form data, encrypting user data and sending and receiving cookies. One of the major features of PHP that makes it so usable is that it is compatible with all major operating systems so you can code no matter what tech you are using.\n" +
                "\n" +
                "How to Use PHP?\n" +
                "There are three major things needed to code effectively in PHP:\n" +
                "\n" +
                "PHP Parser: The parser takes PHP code and analyses it, outputting a respective syntax tree that puts the source into an easier to read format for machines to understand\n" +
                "Web Server: The server is the program that will execute your PHP files to form webpages\n" +
                "Web Browser: The browser will allow you to view the PHP page through the server, in the same way as with any other content on the web\n" +
                "Instructions on how to install PHP requirements can be found on the PHP website.\n" +
                "\n" +
                "Advantages of PHP\n" +
                "PHP has endured as a popular programming language for almost three decades owing to the number of benefits it offers users and developers. The most significant of these are:\n" +
                "\n" +
                "It is cross-platform: As mentioned above, PHP can be run on any major operating system, so you don’t have to worry about compatibility. This also means that you can work on a project team and not have to worry about members being able to access code!\n" +
                "It’s open-source: Open source means that PHP is a free programming language, so you don’t have to worry about additional costs when building your project\n" +
                "Many developers understand it: The longevity of PHP means there’s already a large community out there to support you, and a large amount of legacy code to help you get started with projects.\n" +
                "It works brilliantly with HTML: PHP can help simplify your projects and works seamlessly with this dominant programming language.\n" +
                "As a language, it is relatively easy to learn: Because of its simplicity, PHP is quicker and easier to pick up than some other alternatives. \n" +
                "There are plenty of tools available: There are tools to help you with just about anything for PHP, from integration, code hinting, syntax highlighting and more, there is a lot of support for you.\n" +
                "It offers great load times for websites: With website performance becoming more and more tied to speed, PHP’s quick load can really help you succeed.\n" +
                "Declining in popularity\n" +
                "As a language, PHP is still relatively popular among software developers. However, it is a language in decline with so much choice now available. According to PYPL (PopularitY of Programming Language), PHP is ranked as the sixth most popular coding language in the world. The TIOBE index ranks PHP as the 10th most popular programming language currently available, whilst Stack Overflow’s research has it ranked 11th.\n" +
                "\n" +
                "Who uses PHP?\n" +
                "Even though PHP has been around for quite some time, it is still used among some of the world’s most well-known organisations and websites. Below are just a few of the companies that use it. \n" +
                "\n" +
                "Facebook\n" +
                "Wikipedia\n" +
                "WordPress\n" +
                "Etsy\n" +
                "Slack\n" +
                "So even though it may not be ranking number one in terms of popularity anymore, learning PHP is still a useful investment for developers.\n" +
                "\n" +
                "Get Started\n" +
                "Before you learn PHP, it is hugely beneficial to learn HTML first. HTML is taught as part of Code Institute’s Full Stack Development course, to get you well on your way to getting the most out of PHP. Code Institute also offers a free course that teaches the basics of HTML called the 5 Day Coding Challenge. Register for the free challenge now through the form below."),
        InformationData("Kotlin",R.drawable.ic_kotling,"One of the hottest new programming languages, Kotlin is being prioritised by some of the world’s leading companies. Since first hitting the scene in 2016, this open-source language has quickly built a reputation as one of the key pillars to the future of development.\n" +
                "\n" +
                "But what exactly is Kotlin, will it eventually bury Java and do you need to learn it in 2022? Let’s find out.\n" +
                "\n" +
                "Kotlin: a definition\n" +
                "Like a spiced-up Java, Kotlin is designed to hit the same notes as the classic programming language, while addressing all the flaws and limitations that make it unsuitable for the future. At a time when productivity is becoming increasingly important to innovators the world over, Kotlin takes the coding experience to a new place. \n" +
                "\n" +
                "Kotlin is an open-source, statistically typed programming language that’s designed to work on almost any platform, principally Android, JVM, JavaScript and Native. Inspired by Java, its USP is its simplicity and safety. It’s also 100% interoperable with Java – all Java frameworks and libraries are compatible with Kotlin, so the two can co-exist.\n" +
                "\n" +
                "Kotlin has both object-oriented and functional constructs, making it very flexible, with functional programming features such as higher-order functions, function types and lambdas.\n" +
                "\n" +
                "How many people use Kotlin?\n" +
                "An estimated 5 million people used Kotlin in 2021. This includes 1.3 million active developers – people who edit code from one month to the next.\n" +
                "\n" +
                "What is Kotlin used for?\n" +
                "It can be used for both server-side and client-side applications, both for web and Android. Developers will soon be able to use it for macOS and iOS platforms too.\n" +
                "\n" +
                "As well as mobile and server-side applications, Kotlin is also being used for data science.\n" +
                "\n" +
                "What’s the history of Kotlin?\n" +
                "Kotlin was built by software development tool creators JetBrains in 2010. As most of their products were developed in Java, they decided to build a Java-based language that was more concise, while introducing new constructs such as high-order functions.\n" +
                "\n" +
                "Kotlin’s audience grew steadily over the years until, in 2019, Google announced that Kotlin was its preferred language for Android app developers. It’s now the second most popular JVM language, behind Java.\n" +
                "\n" +
                "Kotlin vs Java\n" +
                "Kotlin does pretty much everything Java does, but does it better. \n" +
                "\n" +
                "It’s more lightweight, cleaner and more concise than Java, particularly when it comes to writing data classes and callbacks. It’s also safer, with inbuilt null safety a prime feature. \n" +
                "\n" +
                "The one clear argument for Java over Kotlin is that Java is more widely used and most Android documentation examples are in Java. So, for complete beginners, learning Java might be an easier ride. That’s not based on Java being better though, so isn’t really a compelling reason in the long run.\n" +
                "\n" +
                "Despite the temptation to throw them head to head in competition, Kotlin and Java both compile to bytecode, which means they can be used in conjunction in the same project. \n" +
                "\n" +
                "This is why many experts believe they’ll coexist. At least for the time being.\n" +
                "\n" +
                "The key Kotlin benefits for developers\n" +
                "Let’s take a look at why Kotlin is such a key programming language in 2021.\n" +
                "\n" +
                "It’s fast and concise – Kotlin uses around 40% less code than Java\n" +
                "It’s safe – mainly due to the addition of null safety\n" +
                "Simple extension functions – developers can easily extend the functionality of classes without the need to inherit from a class\n" +
                "It simplifies the creation of data classes\n" +
                "It handles casts automatically, in a ‘smart’ way\n" +
                "It’s very flexible, with the ability to carry out both object oriented and functional programming\n" +
                "\n" +
                "Why are companies making the switch to Kotlin?\n" +
                "For two key reasons:\n" +
                "\n" +
                "Reduced development time – as Kotlin uses less lines of code than alternatives like Java, developers can read and edit code a lot faster and more efficiently. This means a major reduction in overall development time.\n" +
                "Fewer app crashes – not only does fewer lines of code mean higher productivity, it means locating and ironing out bugs is far simpler. Using a code that’s more concise takes the hassle out of long term maintenance.\n" +
                "Is Kotlin hard to learn?\n" +
                "No. In fact, the makers of Kotlin have specifically designed it to be easy to pick up. While mastering its most advanced features will definitely take a lot of time and effort, getting to grips with the basics should be fairly straightforward.\n" +
                "\n" +
                "Do I need to learn Kotlin?\n" +
                "There are some that will say Kotlin isn’t yet an essential programming language and therefore it’s not important to learn it now.\n" +
                "\n" +
                "Still, there’s no doubt which direction development is moving. It’s headed towards Kotlin over Java, pure and simple. The good news is, if you already know Java, learning Kotlin will be a piece of cake.\n" +
                "\n" +
                "In short, learn Java, then learn Kotlin. You’ll 100% need to know Kotlin if you’re hoping to build a career as any kind of developer or data scientist, as more and more companies are realising the benefits of this fantastic programming language."),
        InformationData("R",R.drawable.ic_r,"R is an open-source programming language that is widely used as a statistical software and data analysis tool. R generally comes with the Command-line interface. R is available across widely used platforms like Windows, Linux, and macOS. Also, the R programming language is the latest cutting-edge tool.\n" +
                "\n" +
                "It was designed by Ross Ihaka and Robert Gentleman at the University of Auckland, New Zealand, and is currently being developed by the R Development Core Team.\n" +
                "\n" +
                "R programming language is an implementation of the S programming language. It also combines with lexical scoping semantics inspired by Scheme. Moreover, the project was conceived in 1992, with an initial version released in 1995 and a stable beta version in 2000.\n" +
                "\n" +
                "why-R\n" +
                "R Programming Language\n" +
                "\n" +
                "\n" +
                "\n" +
                "What is R Programming Language?\n" +
                "R programming is used as a leading tool for machine learning, statistics, and data analysis. Objects, functions, and packages can easily be created by R.\n" +
                "It’s a platform-independent language. This means it can be applied to all operating systems.\n" +
                "It’s an open-source free language. That means anyone can install it in any organization without purchasing a license.\n" +
                "R programming language is not only a statistic package but also allows us to integrate with other languages (C, C++). Thus, you can easily interact with many data sources and statistical packages.\n" +
                "The R programming language has a vast community of users and it’s growing day by day.\n" +
                "R is currently one of the most requested programming languages in the Data Science job market which makes it the hottest trend nowadays\n" +
                "It was designed by Ross Ihaka and Robert Gentleman at the University of Auckland, New Zealand, and is currently being developed by the R Development Core Team.\n" +
                "R programming language is an implementation of the S programming language. It also combines with lexical scoping semantics inspired by Scheme. Moreover, the project was conceived in 1992, with an initial version released in 1995 and a stable beta version in 2000.\n" +
                "Why Use R?\n" +
                "Statistical Analysis: R is designed for analysis and It provides an extensive collection of graphical and statistical techniques, By making a preferred choice for statisticians and data analysts.\n" +
                "Open Source: R is an open – source software, which means it is freely available to anyone. It can be accessble by a vibrant community of users and developers.\n" +
                "Data Visulaization : R boasts an array of libraries like ggplot2 that enable the creation of high-quality, customizable data visualizations.\n" +
                "Data Manipulation : R offers tools that are for data manipulation and transformation. For example: IT simplifies the process of filtering , summarizing and transforming data.\n" +
                "Integration : R can be easily integrate with other programming languages and data sources. IT has connectors to various databases and can be used in conjunction with python, SQL and other tools.\n" +
                "Community and Packages: R has vast ecosystem of packages that extend its functionality. There are packages that can help you accomplish needs of analytics.\n" +
                "Features of R Programming Language\n" +
                "R Packages: One of the major features of R is it has a wide availability of libraries. R has CRAN(Comprehensive R Archive Network), which is a repository holding more than 10, 0000 packages.\n" +
                "Distributed Computing: Distributed computing is a model in which components of a software system are shared among multiple computers to improve efficiency and performance. Two new packages ddR and multidplyr used for distributed programming in R were released in November 2015.\n" +
                "Statistical Features of R\n" +
                "Basic Statistics: The most common basic statistics terms are the mean, mode, and median. These are all known as “Measures of Central Tendency.” So using the R language we can measure central tendency very easily.\n" +
                "Static graphics: R is rich with facilities for creating and developing interesting static graphics. R contains functionality for many plot types including graphic maps, mosaic plots, biplots, and the list goes on.\n" +
                "Probability distributions: Probability distributions play a vital role in statistics and by using R we can easily handle various types of probability distributions such as Binomial Distribution, Normal Distribution, Chi-squared Distribution, and many more.\n" +
                "Data analysis: It provides a large, coherent, and integrated collection of tools for data analysis.\n" +
                "Basic R program\n" +
                "Since R is much similar to other widely used languages syntactically, it is easier to code and learn in R. Programs can be written in R in any of the widely used IDE like R Studio, Rattle, Tinn-R, etc. After writing the program save the file with the extension .r. To run the program use the following command on the command line:  \n" +
                "\n" +
                "R file_name.r\n" +
                "# R program to print Welcome to GFG!\n" +
                " \n" +
                "# Below line will print \"Welcome to GFG!\" \n" +
                "cat(\"Welcome to GFG!\")\n" +
                "Output: \n" +
                "\n" +
                "Welcome to GFG!\n" +
                "Advantages of R\n" +
                "R is the most comprehensive statistical analysis package. As new technology and concepts often appear first in R.\n" +
                "As R programming language is an open source. Thus, you can run R anywhere and at any time.\n" +
                "R programming language is suitable for GNU/Linux and Windows operating systems.\n" +
                "R programming is cross-platform and runs on any operating system.\n" +
                "In R, everyone is welcome to provide new packages, bug fixes, and code enhancements.\n" +
                "Disadvantages of R  \n" +
                "In the R programming language, the standard of some packages is less than perfect.\n" +
                "Although, R commands give little pressure on memory management. So R programming language may consume all available memory.\n" +
                "In R basically, nobody to complain if something doesn’t work.\n" +
                "R programming language is much slower than other programming languages such as Python and MATLAB.\n" +
                "Applications of R  \n" +
                "We use R for Data Science. It gives us a broad variety of libraries related to statistics. It also provides the environment for statistical computing and design.\n" +
                "R is used by many quantitative analysts as its programming tool. Thus, it helps in data importing and cleaning.\n" +
                "R is the most prevalent language. So many data analysts and research programmers use it. Hence, it is used as a fundamental tool for finance.\n" +
                "Tech giants like Google, Facebook, Bing, Twitter, Accenture, Wipro, and many more using R nowadays.\n" +
                "Conclusion\n" +
                "In conclusion , R programming language has emerged as powerful and versatile too for data analysis, statistical modelling and machine learning. R remains the top choice for data scientists, statisticians and researchers across various domain."),
        InformationData("Swift",R.drawable.ic_swift,"About Swift\n" +
                "Swift is a general-purpose programming language that’s approachable for newcomers and powerful for experts. It is fast, modern, safe, and a joy to write.\n" +
                "\n" +
                "Swift is general-purpose and modern. Suitable for everything from systems programming, through mobile and desktop apps, to cloud services.\n" +
                "Swift is safe. Undefined behavior is the enemy of safety, and it’s best to catch mistakes before software goes into production. Swift makes the obvious path the safest.\n" +
                "Swift is fast to run and quick to write. It comes with predictable and consistent performance that is on-par with C-based languages without sacrificing developer friendliness.\n" +
                "Swift is approachable and powerful. From a single-line “Hello, World!” to large-scale apps with hundreds of thousands of lines. Swift scales with your needs.\n" +
                "Tools\n" +
                "Tools are a critical part of the Swift ecosystem. We strive to integrate well within a developer’s toolset, to build quickly, to present excellent diagnostics, and to enable interactive development experiences. Tools can make programming so much more powerful, like Swift-based playgrounds do in Xcode, or a web-based REPL can when working with Linux server-side code.\n" +
                "\n" +
                "Features\n" +
                "Swift includes features that make code easier to read and write, while giving the developer the control needed in a true systems programming language. Swift supports inferred types to make code cleaner and less prone to mistakes, and modules eliminate headers and provide namespaces. Memory is managed automatically, and you don’t even need to type semi-colons. Swift also borrows from other languages, for instance named parameters brought forward from Objective-C are expressed in a clean syntax that makes APIs in Swift easy to read and maintain.\n" +
                "\n" +
                "The features of Swift are designed to work together to create a language that is powerful, yet fun to use. Some additional features of Swift include:\n" +
                "\n" +
                "Closures unified with function pointers\n" +
                "Tuples and multiple return values\n" +
                "Generics\n" +
                "Fast and concise iteration over a range or collection\n" +
                "Structs that support methods, extensions, and protocols\n" +
                "Functional programming patterns, e.g., map and filter\n" +
                "Powerful error handling built-in\n" +
                "Advanced control flow with do, guard, defer, and repeat keywords\n" +
                "Safety\n" +
                "Swift was designed from the outset to be safer than C-based languages, and eliminates entire classes of unsafe code. Variables are always initialized before use, arrays and integers are checked for overflow, and memory is managed automatically. Syntax is tuned to make it easy to define your intent — for example, simple three-character keywords define a variable (var) or constant (let).\n" +
                "\n" +
                "Another safety feature is that by default Swift objects can never be nil, and trying to make or use a nil object results in a compile-time error. This makes writing code much cleaner and safer, and prevents a common cause of runtime crashes. However, there are cases where nil is appropriate, and for these situations Swift has an innovative feature known as optionals. An optional may contain nil, but Swift syntax forces you to safely deal with it using ? to indicate to the compiler you understand the behavior and will handle it safely.\n" +
                "\n" +
                "Platform Support\n" +
                "One of the most exciting aspects of developing Swift in the open is knowing that it is now free to be ported across a wide range of platforms, devices, and use cases.\n" +
                "\n" +
                "Our goal is to provide source compatibility for Swift across all platforms, even though the actual implementation mechanisms may differ from one platform to the next. The primary example is that the Apple platforms include the Objective-C runtime, which is required to access Apple platform frameworks such as UIKit and AppKit. On other platforms, such as Linux, no Objective-C runtime is present, because it isn’t necessary.\n" +
                "\n" +
                "The Swift core libraries project aims to extend the cross-platform capabilities of Swift by providing portable implementations of fundamental Apple frameworks (such as Foundation) without dependencies on the Objective-C runtime. Although the core libraries are in an early stage of development, they will eventually provide improved source compatibility for Swift code across all platforms.\n" +
                "\n" +
                "Apple Platforms\n" +
                "Open-source Swift can be used on the Mac to target all of the Apple platforms: iOS, macOS, watchOS, and tvOS. Moreover, binary builds of open-source Swift integrate with the Xcode developer tools, including complete support for the Xcode build system, code completion in the editor, and integrated debugging, allowing anyone to experiment with the latest Swift developments in a familiar Cocoa and Cocoa Touch development environment.\n" +
                "\n" +
                "Linux\n" +
                "Open-source Swift can be used on Linux to build Swift libraries and applications. The open-source binary builds provide the Swift compiler and standard library, Swift REPL and debugger (LLDB), and the core libraries, so one can jump right in to Swift development.\n" +
                "\n" +
                "Windows\n" +
                "Open source Swift can be used on Windows to build Swift libraries and applications. The open source binary builds provide C/C++/Swift toolchains, the standard library, and debugger (LLDB), as well as the core libraries, so one can jump right in to Swift development. SourceKit-LSP is bundled into the releases to enable developers to be quickly productive with the IDE of their choice.\n" +
                "\n" +
                "New Platforms\n" +
                "We can’t wait to see the new places we can bring Swift—together. We truly believe that this language that we love can make software safer, faster, and easier to maintain. We’d love your help to bring Swift to even more computing platforms.\n" +
                "\n" +
                "Swift.org and Open Source\n" +
                "On December 3, 2015, the Swift language, supporting libraries, debugger, and package manager were published under the Apache 2.0 license with a Runtime Library Exception, and Swift.org was created to host the project. The source code is hosted on GitHub where it is easy for anyone to get the code, build it themselves, and even create pull requests to contribute code back to the project. Everyone is welcome, even just to file a bug report. There are excellent Getting Started guides available here on the site as well.\n" +
                "\n" +
                "The project is governed by a core team of engineers that drive the strategic direction by working with the community, and a collection of code owners responsible for the day-to-day project management. Technical leaders come from the community of contributors and anyone can earn the right to lead an area of Swift. The Community Overview includes detailed information on how the Swift community is managed.\n" +
                "\n" +
                "Projects\n" +
                "The Swift language is managed as a collection of projects, each with its own repositories. The current list of projects includes:\n" +
                "\n" +
                "The Swift compiler command line tool\n" +
                "The standard library bundled as part of the language\n" +
                "Core libraries that provide higher-level functionality\n" +
                "The LLDB debugger which includes the Swift REPL\n" +
                "The Swift package manager for distributing and building Swift source code\n" +
                "Xcode playground support to enable playgrounds in Xcode."),
        InformationData("Go",R.drawable.ic_go,"You can use almost any programming language in the cloud, but there are a few languages that stand out from the rest. Let's talk about one of those languages, Go.\n" +
                "\n" +
                "Go is an open-source programming language focused on simplicity, reliability, and efficiency.\n" +
                "\n" +
                "Go was originally designed at Google in 2007. At the time, Google was growing quickly, and code being used to manage their infrastructure was also growing quickly in both size and complexity. Some Google cloud engineers began to feel that this large and complex codebase was slowing them down. So they decided that they needed a new programming language focused on simplicity and quick performance. Robert Griesemer, Rob Pike, and Ken Thompson designed Go.\n" +
                "\n" +
                "Go became an open-source project and was released publicly in 2012. It quickly gained a surprising level of popularity and has become one of the leading modern programming languages.\n" +
                "\n" +
                "How to build a Serverless app using Go and Azure Functions\n" +
                "Is it called Go or Golang?\n" +
                "Is the language called Go or Golang? Take it straight from the horse's Google's mouth here: the language is called \"Go.\"\n" +
                "\n" +
                "Google says the \"Golang\" moniker came about due to the website, golang.org, which was selected because \"go.org was not available to us.\" As a result, some people use the \"Golang\" interchangeably with \"Go\" when referring to the programming language. (Not us, but you know . . . )\n" +
                "\n" +
                "In fairness though, Golang is much more Google-able than Go, which could refer to the strategy game or the cult-classic Doug Liman movie. Golang is also used as the Twitter tag for Go, #golang.\n" +
                "\n" +
                "What is the Golang used for?\n" +
                "Go was originally built for programs related to networking and infrastructure. It was intended to replace popular high-performance server-side languages like Java and C++. Today, Go is used for a variety of applications:\n" +
                "\n" +
                "Go is popular for cloud-based or server-side applications. \n" +
                "DevOps and site reliability automation are also popular ways to use Go. \n" +
                "Many command-line tools are written in Go.\n" +
                "Go is used in the world of artificial intelligence and data science.\n" +
                "Some use Go from micro-controller programming, robotics, and games.\n" +
                "However, Go really shines the most when it comes to infrastructure. Some of the most popular infrastructure tools today are written in Go — such as Kubernetes, Docker, and Prometheus.\n" +
                "\n" +
                "Why is Go popular?\n" +
                "Why is Go so popular? There may be as many opinions on this as there are Go programmers, but two reasons really stand out:\n" +
                "\n" +
                "Programming language simplicity\n" +
                "First, Go is simple to learn and understand. A popular saying about Go is that you can read and digest the entire Go spec in an afternoon. Many developers who have dived into Go agree it's easy to pick up compared to other languages. \n" +
                "\n" +
                "High-performing applications\n" +
                "Second, Go is great when it comes to performance. It was designed for automation at a large scale so Go makes it relatively easy to write high-performing applications. \n" +
                "\n" +
                "Cloud Dictionary\n" +
                "Get the Cloud Dictionary of Pain\n" +
                "Speaking cloud doesn’t have to be hard. We analyzed millions of responses to ID the concepts that trip people up. Grab this cloud guide for succinct definitions of the most painful cloud terms.\n" +
                "\n" +
                "Get the Goods\n" +
                "Go vs Other Programming Languages\n" +
                "According to the 2020 Stack Overflow Developer Survey, Go is one of the most loved languages by developers who use it. Go's own 2020 developer survey seems to agree, with a 92% satisfaction rating by Go users.\n" +
                "\n" +
                "Go vs Python\n" +
                "Python is more than 30 years old, but it continues to grow in popularity. The design of the language has stood the test of time (despite some rough spots along the way). Today, Python and Go are two of the most popular and convenient-to-use programming languages out there.\n" +
                "\n" +
                "Python is a great object-oriented language, but you can also write programs in a functional programming style too. Of all the programming languages, you probably won't find one used by more non-programmers than Python. Its flexibility is one of the reasons Python is so popular. It can be used for everything from cleaning up files on your computers to web applications, serverless projects, teaching programming to kids, working on animation, and more.\n" +
                "\n" +
                "But how does Go compare to Python?\n" +
                "Python and Go both have a simple syntax and first-party support from all major cloud providers.\n" +
                "Both Go and Python are easy to get started with for beginners and are relatively easy to learn. There's debate over which is easier. Go is a simpler language and may be mastered more quickly, but some find getting started more difficult than Python, which takes longer to master as there's more to learn.\n" +
                "Go is a new kid on the block compared to Python, and it was designed to be fast. Go is faster than Python. Much faster.\n" +
                "Python tends to dominate in data science; Go is perfect for system programming.\n" +
                "As the senior language, Python has a more extensive library and community built up around it.\n" +
                "Python's dynamic typing can make it better than Go for quick prototyping.\n" +
                "It can be easier to run applications at scale with Go. Go was built by Google to solve problems at a Google-sized scale making it ideal for working on large concurrent applications. Go supports concurrency, or the ability to run more than one program/task simultaneously. Python doesn't.\n" +
                "Python and Go each offer their unique benefits, but there's no reason you can't and shouldn't learn to use both!\n" +
                "\n" +
                "Should I learn Go?\n" +
                "So why should you learn Go? Go is easy. Many developers agree that Go is easy to get into. And its code is relatively easy to understand. Learning Go comes with a big payoff in terms of power and versatility. \n" +
                "\n" +
                "Go is a language that can do a lot, from infrastructure to the web to data processing.\n" +
                "Cloud platforms love Go. Amazon Web Services, Microsoft Azure, and Google Cloud Platform (GCP) all give Go first-class support as a major language. So if you're programming in the cloud, Go is a great choice. \n" +
                "Go also has a vibrant and active open-source community that develops modules and libraries, helps newcomers, and contributes to the Go project itself. \n" +
                "According to the 2020 Stack Overflow Developer Survey, Go developers have the second-highest median salary in the U.S. at \$140,000 per year. \n" +
                "So if you're interested in a programming language that can do a lot, has a great community, and is easy to learn, check out Go.\n" +
                "\n" +
                "Check out ACG's System Tooling with Go course. It will teach you enough Go to be able to write your own tools. You’ll learn how to leverage Go’s robust standard library, third-party packages, and how to handle some of the most common tasks when writing tools/scripts.\n" +
                "\n" +
                "Transforming careers, transforming businesses\n" +
                "Learn faster. Move faster. Transform now with courses and real hands-on labs in AWS, Microsoft Azure, Google Cloud, and beyond.\n" +
                "\n" +
                "Start a Free Trial\n" +
                "What is Go Programming Language?\n" +
                "Go is an open-source programming language focused on simplicity, reliability, and efficiency. Go became an open-source project and was released publicly in 2012. It quickly gained a surprising level of popularity and has become one of the leading modern programming languages.\n" +
                "\n" +
                "What is Golang used for?\n" +
                "Go was originally built for programs related to networking and infrastructure. It was intended to replace popular high-performance server-side languages like Java and C++. Today, Go is used for a variety of applications like cloud and server side applications, DevOps, command line tools and much more.\n" +
                "\n" +
                "Go Programming vs Python?\n" +
                "Python and Go both have a simple syntax and first-party support from all major cloud providers. Both Go and Python are easy to get started with for beginners and are relatively easy to learn. There's debate over which is easier. Go is a simpler language and may be mastered more quickly, but some find getting started more difficult than Python, which takes longer to master as there's more to learn. Read more!"),
        InformationData("Ruby",R.drawable.ic_ruby,"Ruby is a popular general-purpose object-oriented programming (OOP) language that focuses on simplicity and productivity. You can use Ruby in many fields of computer science, including web development and data analysis.\n" +
                "\n" +
                "When compared to other programming languages, like C or Java, Ruby is more user-friendly and easier to learn because Ruby has intuitive and English-like syntax. Even if you’ve never written a line of code in your life, you might understand what a basic Ruby program does thanks to its simple syntax. Ruby is a great candidate if you’re looking to learn your first programming language.\n" +
                "\n" +
                "WHAT IS THE RUBY PROGRAMMING LANGUAGE USED FOR?\n" +
                "Web development\n" +
                "Static site generation\n" +
                "DevOps and automation\n" +
                "Web servers\n" +
                "Web scraping\n" +
                "RELATED READING FROM BUILT IN EXPERTS\n" +
                "Gems in Ruby on Rails and How to Find Them\n" +
                "\n" +
                " \n" +
                "\n" +
                "When Do I Use the Ruby Programming Language?\n" +
                "Ruby is a multi-purpose programming language used in many subfields of software development. Here are the most notable Ruby use cases.\n" +
                "\n" +
                " \n" +
                "\n" +
                "WEB DEVELOPMENT\n" +
                "One of the main reasons Ruby is such a popular programming language is thanks to the Ruby on Rails framework that revolutionized web development. \n" +
                "\n" +
                "Before the Rails framework popped up in 2005, developers spent too much time writing repetitive boilerplate code to build web apps. The Rails framework changed this because it comes with everything a developer needs to build a scalable website. You can run a simple command to generate boilerplate code, build a database model or generate a proper file structure. These types of automations let developers focus more on coding a web app’s logic rather than spending time on low-value work.\n" +
                "\n" +
                "\n" +
                "Ruby in 100 Seconds. | Video: Fireship\n" +
                " \n" +
                "\n" +
                "STATIC SITE GENERATION\n" +
                "When you visit a typical web page, the website uses server-side code that generates the HTML content it serves to your browser. This means there’s no HTML file behind the URL you visit. This type of HTML generation is usually not the fastest way to serve web files to clients. It’s more effective to use a state website generator like Jekyll, one of the most popular static site generators, which is written in Ruby.\n" +
                "\n" +
                "A static website generator uses code to generate all the web pages at once. Those pages will then live on a server and once you visit the site, you get a static HTML file. This makes websites efficient, secure and easy to deploy. A static website generator is ideal for websites whose content doesn’t change that often.\n" +
                "\n" +
                " \n" +
                "\n" +
                "DEVOPS AND AUTOMATION\n" +
                "Ruby is a popular programming language in DevOps, automation and website deployment.\n" +
                "\n" +
                "Consider the popular web app deployment platform Heroku. This platform gained popularity because it allows for testing, deploying and staging web applications without DevOps engineers. Originally, Heroku only supported the Ruby programming language.\n" +
                "\n" +
                "Vagrant, a popular virtual machine management system, is also written in Ruby. With Vagrant, developers can run operating system-specific software on any operating system. For example, a developer can turn a Linux-only service into a Mac-executable format.\n" +
                "\n" +
                " \n" +
                "\n" +
                "WEB SERVERS\n" +
                "Ruby is a popular programming language for building web servers. The popular web application servers Passenger and Puma both support Ruby. These web application servers process HTTP requests, manage processes and resources, and allow for monitoring and diagnosing problems.\n" +
                "\n" +
                "MORE FROM ARTTURI JALLI\n" +
                "What Is the @ Symbol in Python and How Do I Use It?\n" +
                "\n" +
                " \n" +
                "\n" +
                "DATA PROCESSING\n" +
                "Ruby is a great language for data processing, thanks in part to the language’s readable syntax. Ruby also has several other powerful built-in functions, such as map, reduce and select. These functions are great for easy data processing, cleaning and filtering.\n" +
                "\n" +
                " \n" +
                "\n" +
                "WEB SCRAPING\n" +
                "Ruby comes with packages, such as Vessel, that make parsing web data easy. With Vessel, you can write Ruby scripts that crawl and download web pages in a breeze. To then parse the crawled HTML content, you can use another popular Ruby library, Nokogiri. With this library, you can prepare the crawled data for new HTML or XML objects or to perform data analysis, such as building a machine learning model based on crawled data.\n" +
                "\n" +
                "Find out who's hiring.\n" +
                "See all Developer + Engineer jobs at top tech companies & startups\n" +
                "VIEW 9552 JOBS\n" +
                " \n" +
                "\n" +
                "Ruby vs. Python: Which Is Better?\n" +
                "Ruby is a great multi-purpose programming language and more popular among web developers, whereas Python is the de facto general-purpose language today.\n" +
                "\n" +
                "Ruby and Python each have intuitive syntaxes that almost read like English. Thanks to each language’s easy syntax and large user base, Ruby and Python are both great languages for any first-time programmer to learn. \n" +
                "\n" +
                "One of the main differences between Ruby and Python is in the usability. Ruby is a programming language mainly used in web development. With Ruby and the leading Ruby framework, Ruby on Rails, you can build modern web applications at scale. Besides, there are many developers in Ruby communities, such as on StackOverflow.\n" +
                "\n" +
                "On the other hand, Python is a multi-purpose programming language and has use cases in all corners of the IT industry. You can use Python in data science, game development, web development, scripting and more. Needless to say, Python has a large community of developers in each of these subfields. No matter what you’re looking for, you’re guaranteed to have a Python package or framework and a large developer base at your disposal. Let’s say you want to do financial modeling with Python. Unsurprisingly, there are lots of packages of pre-written code for streamlined financial modeling."),
        InformationData("Rust",R.drawable.ic_rust,"Rust has been Stack Overflow's most loved language for four years in a row, indicating that many of those who have had the opportunity to use Rust have fallen in love with it. However, the roughly 97% of survey respondents who haven't used Rust may wonder, \"What's the deal with Rust?\"\n" +
                "\n" +
                "Article hero image\n" +
                "Rust has been Stack Overflow's most loved language for four years in a row, indicating that many of those who have had the opportunity to use Rust have fallen in love with it. However, the roughly 97% of survey respondents who haven't used Rust may wonder, \"What's the deal with Rust?\"\n" +
                "\n" +
                "The short answer is that Rust solves pain points present in many other languages, providing a solid step forward with a limited number of downsides.\n" +
                "\n" +
                "I’ll show a sample of what Rust offers to users of other programming languages and what the current ecosystem looks like. It’s not all roses in Rust-land, so I talk about the downsides, too.\n" +
                "\n" +
                "Coming from dynamically-typed languages\n" +
                "The arguments between programmers who prefer dynamic versus static type systems are likely to endure for decades more, but it's hard to argue about the benefits of static types. You only need to look at the rise of languages like TypeScript or features like Python's type hints as people have become frustrated with the current state of dynamic typing in today's larger codebases. Statically-typed languages allow for compiler-checked constraints on the data and its behavior, alleviating cognitive overhead and misunderstandings.\n" +
                "\n" +
                "This isn't to say that all static type systems are equivalent. Many statically-typed languages have a large asterisk next to them: they allow for the concept of NULL. This means any value may be what it says or nothing, effectively creating a second possible type for every type. Like Haskell and some other modern programming languages, Rust encodes this possibility using an optional type, and the compiler requires you to handle the None case. This prevents occurrences of the dreaded TypeError: Cannot read property 'foo' of null runtime error (or language equivalent), instead promoting it to a compile time error you can resolve before a user ever sees it. Here's an example of a function to greet someone whether or not we know their name; if we had forgotten the None case in the match or tried to use name as if it was an always-present String value, the compiler would complain.\n" +
                "\n" +
                "fn greet_user(name: Option<String>) {\n" +
                "    match name {\n" +
                "        Some(name) => println!(\"Hello there, {}!\", name),\n" +
                "        None => println!(\"Well howdy, stranger!\"),\n" +
                "    }\n" +
                "}\n" +
                "Rust's static typing does its best to get out of the programmer's way while encouraging long-term maintainability. Some statically-typed languages place a large burden on the programmer, requiring them to repeat the type of a variable multiple times, which hinders readability and refactoring. Other statically-typed languages allow whole-program type inference. While convenient during initial development, this reduces the ability of the compiler to provide useful error information when types no longer match. Rust learns from both of these styles and requires top-level items like function arguments and constants to have explicit types, while allowing type inference inside of function bodies. In this example, the Rust compiler can infer the type of twice, 2, and 1 because the val parameter and the return type are declared as 32-bit signed integers.\n" +
                "\n" +
                "fn simple_math(val: i32) -> i32 {\n" +
                "    let twice = val * 2;\n" +
                "    twice - 1\n" +
                "}\n" +
                "Coming from garbage-collected languages\n" +
                "One of the biggest benefits of using a systems programming language is the ability to have control over low-level details.\n" +
                "\n" +
                "Rust gives you the choice of storing data on the stack or on the heap and determines at compile time when memory is no longer needed and can be cleaned up. This allows efficient usage of memory as well as more performant memory access. Tilde, an early production user of Rust in their Skylight product, found they were able to reduce their memory usage from 5GiB to 50MiB by rewriting certain Java HTTP endpoints in idiomatic Rust. Savings like this quickly add up when cloud providers charge premium prices for increased memory or additional nodes.\n" +
                "\n" +
                "Without the need to have a garbage collector continuously running, Rust projects are well-suited to be used as libraries by other programming languages via foreign-function interfaces. This allows existing projects to replace performance-critical pieces with speedy Rust code without the memory safety risks inherent with other systems programming languages. Some projects have even been incrementally rewritten in Rust using these techniques.\n" +
                "\n" +
                "With direct access to hardware and memory, Rust is an ideal language for embedded and bare-metal development. You can write extremely low-level code, such as operating system kernels or microcontroller applications. Rust's core types and functions as well as reusable library code shine in these especially challenging environments.\n" +
                "\n" +
                "Coming from other systems programming languages\n" +
                "To many people, Rust is largely viewed as an alternative to other systems programming languages, like C or C++. The biggest benefit Rust can provide compared to these languages is the borrow checker. This is the part of the compiler responsible for ensuring that references do not outlive the data they refer to, and it helps eliminate entire classes of bugs caused by memory unsafety.\n" +
                "\n" +
                "Unlike many existing systems programming languages, Rust doesn't require that you spend all of your time mired in nitty-gritty details. Rust strives to have as many zero-cost abstractions as possible—abstractions that are as equally as performant as the equivalent hand-written code. In this example, we show how iterators, a primary Rust abstraction, can be used to succinctly create a vector containing the first ten square numbers.\n" +
                "\n" +
                "let squares: Vec<_> = (0..10).map(|i| i * i).collect();\n" +
                "When safe Rust isn't able to express some concept, you can use unsafe Rust. This unlocks a few extra powers, but in exchange the programmer is now responsible for ensuring that the code is truly safe. This unsafe code can then be wrapped in higher-level abstractions which guarantee that all uses of the abstraction are safe.\n" +
                "\n" +
                "Using unsafe code should be a calculated decision, as using it correctly requires as much thought and care as any other language where you are responsible for avoiding undefined behavior. Minimizing unsafe code is the best way to minimize the possibilities for segfaults and vulnerabilities due to memory unsafety.\n" +
                "\n" +
                "Systems programming languages have the implicit expectation that they will be around effectively forever. While some modern development doesn't require that amount of longevity, many businesses want to know that their fundamental code base will be usable for the foreseeable future. Rust recognizes this and has made conscious design decisions around backwards compatibility and stability; it's a language designed for the next 40 years.\n" +
                "\n" +
                "The Rust ecosystem\n" +
                "The Rust experience is larger than a language specification and a compiler; many aspects of creating and maintaining production-quality software are treated as first-class citizens. Multiple concurrent Rust toolchains can be installed and managed via rustup. Rust installations come with Cargo, a command line tool to manage dependencies, run tests, generate documentation, and more. Because dependencies, tests, and documentation are available by default, their usage is prevalent. crates.io is the community site for sharing and discovering Rust libraries. Any library published to crates.io will have its documentation built and published on docs.rs.\n" +
                "\n" +
                "In addition to the built-in tools, the Rust community has created a large number of development tools. Benchmarking, fuzzing, and property-based testing are all easily accessible and well-used in projects. Extra compiler lints are available from Clippy and automatic idiomatic formatting is provided by rustfmt. IDE support is healthy and growing more capable every day.\n" +
                "\n" +
                "Going beyond technical points, Rust has a vibrant, welcoming community. There are several official and unofficial avenues for people to get help, such as the chat, the user's forum, the Rust subreddit, and, of course, Stack Overflow questions and answers and chatroom. Rust has a code of conduct enforced by an awesome moderation team to make sure that the official spaces are welcoming, and most unofficial spaces also observe something similar.\n" +
                "\n" +
                "Offline, Rust has multiple conferences across the globe, such as RustConf, Rust Belt Rust, RustFest, Rust Latam, RustCon Asia, and more.\n" +
                "\n" +
                "It's not all roses\n" +
                "Rust's strong type system and emphasis on memory safety—all enforced at compile time—mean that it's extremely common to get errors when compiling your code. This can be a frustrating feeling for programmers not used to such an opinionated programming language. However, the Rust developers have spent a large amount of time working to improve the error messages to ensure that they are clear and actionable. Don't let your eyes gloss over while reading Rust errors!\n" +
                "\n" +
                "It's especially common to hear someone complain that they've been \"fighting the borrow checker.\" While these errors can be disheartening, it's important to recognize that each of the locations identified had the potential to introduce bugs and potential vulnerabilities in a language that didn't perform the same checks.\n" +
                "\n" +
                "In this example, we create a mutable string containing a name, then take a reference to the first three bytes of the name. While that reference is outstanding, we attempt to mutate the string by clearing it. There's now no guarantee that the reference points to valid data and dereferencing it could lead to undefined behavior, so the compiler stops us:\n" +
                "\n" +
                "fn no_mutable_aliasing() {\n" +
                "    let mut name = String::from(\"Vivian\");\n" +
                "    let nickname = &name[..3];\n" +
                "    name.clear();\n" +
                "    println!(\"Hello there, {}!\", nickname);\n" +
                "}\n" +
                "error[E0502]: cannot borrow `name` as mutable because it is also borrowed as immutable\n" +
                " --> a.rs:4:5\n" +
                "  |\n" +
                "3 |     let nickname = &name[..3];\n" +
                "  |                     ---- immutable borrow occurs here\n" +
                "4 |     name.clear();\n" +
                "  |     ^^^^^^^^^^^^ mutable borrow occurs here\n" +
                "5 |     println!(\"Hello there, {}!\", nickname);\n" +
                "  |                                  -------- immutable borrow later used here\n" +
                "\n" +
                "For more information about this error, try `rustc --explain E0502`.\n" +
                "Helpfully, the error message incorporates our code and tries its hardest to explain the problem, pointing out exact locations.\n" +
                "\n" +
                "Prototyping solutions in Rust can be challenging due to its statically-typed nature and because Rust requires covering 100% of the conditions, not just 99%. Edge cases must have applicable code, even when the programmer doesn't yet know what the happy path should do. During early development, these edge cases can often be addressed by causing the program to crash, and then rigorous error handling can be added at a later point. This is a different workflow than in languages such as Ruby, where developers often try out code in a REPL and then move that to a prototype without considering error cases at all.\n" +
                "\n" +
                "Rust is still relatively new, which means that some desired libraries may not be available yet. The upside is there's plenty of fertile ground to develop these needed libraries, perhaps even taking advantage of recent developments in the relevant computer science fields. Due to this and Rust's capabilities, some of Rust's libraries, such as the regex crate, are the best-in-breed across any language.\n" +
                "\n" +
                "While Rust has a strong commitment to stability and backwards compatibility, that doesn't imply the language is finalized. A specific problem may not have access to language features that would make it simpler to express or perhaps even possible to express. As an example, Rust has had asynchronous futures for over three years, but stable async / await support in the language itself is only a few months old.\n" +
                "\n" +
                "The Rust compiler is built on top of LLVM, which means that the number of target platforms will be smaller than C or C++.\n" +
                "\n" +
                "Come and join us!\n" +
                "Regardless of which programming languages you love now, there's bound to be something that excites or intrigues you about Rust. These are some of the reasons why I and others love Rust so much, and there's many more. If you are looking for extra structure in your project, faster or more efficient code, or the ability to write performant code more quickly and safely, it's time for you to see if Rust will be your next most-loved language!"),
        InformationData("Apache Groovy",R.drawable.ic_apache_groovy,"Would you like to help us make the Groovy programming language even better? There are many ways in which you can get involved, make a difference and help the Groovy development team to make Groovy even, well, groovier? We really appreciate and welcome contributions and you can help us by:\n" +
                "\n" +
                "helping other users or discussing future language directions on the mailing-lists\n" +
                "contribute to discussions on Slack - this channel is not endorsed by the Apache Software Foundation, it's run by Groovy enthusiasts in the community for casual conversations and Q&A,\n" +
                "reporting or fixing issues you encounter in our bug tracker\n" +
                "documenting various aspects of the language or its APIs\n" +
                "writing a blog post about some Groovy feature or your Groovy usage\n" +
                "creating or commenting on the Groovy Enhancement Proposals which describe how we make significant changes to the language\n" +
                "improving this website\n" +
                "covering the code base with more tests to avoid future regressions,\n" +
                "and of course, by contributing bug fixes or new features\n" +
                "Discussing on the mailing-lists and forums\n" +
                "If you encounter a problem, want to discuss a new feature, share interesting findings, and more, then the mailing-lists are the place to go to start a conversation with the Groovy developers and other Groovy users. Discussions on the mailing list are archived. It's the place to go to for all formal discussions or if you want to search the archives.\n" +
                "\n" +
                "Alternatively, for more casual conversations and Q&A, consider using the Slack channel. (This channel is not endorsed by the Apache Software Foundation; it's run by Groovy enthusiasts in the community.)\n" +
                "\n" +
                "Reporting issues\n" +
                "If you are wanting to search existing issues, raise a new one or are keen to fix some existing issues, then you should become familiar with Groovy's Bug tracker.\n" +
                "\n" +
                "Before submitting a new issue, we recommend you read our guide to reporting issues\n" +
                "\n" +
                "\n" +
                "Writing a blog post\n" +
                "Groovy has a lot of great features that some folks have never heard of. Why not write an interesting post about your favourite feature. You can use your own blogging platform or create a pull request for a new post in the blog part of our website which are published onto our own blogging site.\n" +
                "\n" +
                "Improving the documentation\n" +
                "The documentation of the Groovy programming language comes in various forms:\n" +
                "\n" +
                "the reference documentation covering the language specification, the user guides, getting started, and more.\n" +
                "the GroovyDoc APIs documenting the classes of the Groovy code base\n" +
                "the Groovy GDK documentation, explaining how Groovy enriches the JDK APIs\n" +
                "this website\n" +
                "To contribute to the Groovy reference documentation, this blog post gives all the details on how you can work on that documentation.\n" +
                "\n" +
                "All the above is stored in our code repositories on Github, so having an account on Github would be ideal.\n" +
                "\n" +
                "Contributing to this website is fairly easy, if you have a Github account already, as you can click on the Improve this doc buttons that you can see on all the pages of this website. So don't hesitate to help us improve it, fix typos, broken language, clarify complicated sections, add new material, etc.\n" +
                "\n" +
                "Please check the following section for more information on how to contribute to our codebase.\n" +
                "\n" +
                "Contributing code\n" +
                "If you know the area you want to contribute to, this is great, but if you are looking for some first contributions, the Groovy development team tries to maintain a list of tickets of possible easy contributions that could get you started on your journey to become a Groovy committer. Just raise your hand on the Groovy developer mailing-list to tell us about your desire to work on that ticket.\n" +
                "\n" +
                "For more complicated tasks, the best approach is also to bring that to the attention of the Groovy developers, so they can give you some guidance on how best to tackle a particular problem, discuss implementation ideas and the semantics or scope of the proposed change.\n" +
                "\n" +
                "Cloning the code base\n" +
                "To work on the Groovy code base, you should be proficient enough in git and you should have an account on Github to be able to create pull requests with your changes.\n" +
                "\n" +
                "Please fork https://github.com/apache/groovy and create a local clone of your fork as explained in fork a repo.\n" +
                "\n" +
                "Make sure you configure Git appropriately with the same email that you registered with on Github:\n" +
                "\n" +
                "git config --global user.name \"YOUR NAME\"\n" +
                "git config --global user.email \"YOUR EMAIL\"\n" +
                "You can verify these are configured appropriately by running:\n" +
                "\n" +
                "git config --list\n" +
                "Working on the code base\n" +
                "If you are working with the IntelliJ IDEA development environment, this screencast gives lots of details on how to setup your IDE.\n" +
                "\n" +
                "Then, to work on the Groovy code base, to build and test Groovy, you can follow the instructions from the readme file in the Groovy repository.\n" +
                "\n" +
                "The most important command you will have to run before sending your changes is the test command:\n" +
                "\n" +
                "./gradlew test\n" +
                "For a successful contribution, all tests should be green!\n" +
                "\n" +
                "Creating a pull request\n" +
                "Once you are satisfied with your changes:\n" +
                "\n" +
                "commit your changes in your local branch\n" +
                "push your changes to your remote branch on Github\n" +
                "send us a pull request\n" +
                "Donating to Friends of Groovy Open Collective\n" +
                "As an independent initiative, members of the broader Groovy community have set up an open collective for Groovy: Friends of Groovy Open Collective This initiative is designed to complement the Apache project and the many contributions we get from our great community and supporters.\n" +
                "\n" +
                "Build status\n" +
                "The Groovy sources are tested thanks to our continuous integration server."),
        InformationData("Dart",R.drawable.ic_dart,"Dart is a client-optimized language for developing fast apps on any platform. Its goal is to offer the most productive programming language for multi-platform development, paired with a flexible execution runtime platform for app frameworks.\n" +
                "\n" +
                "Languages are defined by their technical envelope—the choices made during development that shape the capabilities and strengths of a language. Dart is designed for a technical envelope that is particularly suited to client development, prioritizing both development (sub-second stateful hot reload) and high-quality production experiences across a wide variety of compilation targets (web, mobile, and desktop).\n" +
                "\n" +
                "Dart also forms the foundation of Flutter. Dart provides the language and runtimes that power Flutter apps, but Dart also supports many core developer tasks like formatting, analyzing, and testing code.\n" +
                "\n" +
                "Dart: The language\n" +
                "#\n" +
                "The Dart language is type safe; it uses static type checking to ensure that a variable's value always matches the variable's static type. Sometimes, this is referred to as sound typing. Although types are mandatory, type annotations are optional because of type inference. The Dart typing system is also flexible, allowing the use of a dynamic type combined with runtime checks, which can be useful during experimentation or for code that needs to be especially dynamic.\n" +
                "\n" +
                "Dart has built-in sound null safety. This means values can't be null unless you say they can be. With sound null safety, Dart can protect you from null exceptions at runtime through static code analysis. Unlike many other null-safe languages, when Dart determines that a variable is non-nullable, that variable can never be null. If you inspect your running code in the debugger, you see that non-nullability is retained at runtime; hence sound null safety.\n" +
                "\n" +
                "The following code sample showcases several Dart language features, including libraries, async calls, nullable and non-nullable types, arrow syntax, generators, streams, and getters. To learn more about the language, check out the Dart language tour.\n" +
                "\n" +
                "\n" +
                "Note\n" +
                "This example is running in an embedded DartPad. You can also open this example in its own window.\n" +
                "\n" +
                "Dart: The libraries\n" +
                "#\n" +
                "Dart has a rich set of core libraries, providing essentials for many everyday programming tasks:\n" +
                "\n" +
                "Built-in types, collections, and other core functionality for every Dart program (dart:core)\n" +
                "Richer collection types such as queues, linked lists, hashmaps, and binary trees (dart:collection)\n" +
                "Encoders and decoders for converting between different data representations, including JSON and UTF-8 (dart:convert)\n" +
                "Mathematical constants and functions, and random number generation (dart:math)\n" +
                "Support for asynchronous programming, with classes such as Future and Stream (dart:async)\n" +
                "Lists that efficiently handle fixed-sized data (for example, unsigned 8-byte integers) and SIMD numeric types (dart:typed_data)\n" +
                "File, socket, HTTP, and other I/O support for non-web applications (dart:io)\n" +
                "Foreign function interfaces for interoperability with other code that presents a C-style interface (dart:ffi)\n" +
                "Concurrent programming using isolates—independent workers that are similar to threads but don't share memory, communicating only through messages (dart:isolate)\n" +
                "HTML elements and other resources for web-based applications that need to interact with the browser and the Document Object Model (DOM) (dart:html)\n" +
                "Beyond the core libraries, many APIs are provided through a comprehensive set of packages. The Dart team publishes many useful supplementary packages, such as these:\n" +
                "\n" +
                "characters\n" +
                "intl\n" +
                "http\n" +
                "crypto\n" +
                "markdown\n" +
                "Additionally, third-party publishers and the broader community publish thousands of packages, with support for features like these:\n" +
                "\n" +
                "XML\n" +
                "Windows integration\n" +
                "SQLite\n" +
                "compression\n" +
                "To see a series of working examples featuring the Dart core libraries, read the core library documentation. To find additional APIs, see the commonly used packages page.\n" +
                "\n" +
                "Dart: The platforms\n" +
                "#\n" +
                "Dart's compiler technology lets you run code in different ways:\n" +
                "\n" +
                "Native platform: For apps targeting mobile and desktop devices, Dart includes both a Dart VM with just-in-time (JIT) compilation and an ahead-of-time (AOT) compiler for producing machine code.\n" +
                "\n" +
                "Web platform: For apps targeting the web, Dart can compile for development or production purposes. Its web compiler translates Dart into JavaScript.\n" +
                "\n" +
                "An illustration of the targets supported by Dart\n" +
                "\n" +
                "The Flutter framework is a popular, multi-platform UI toolkit that's powered by the Dart platform, and that provides tooling and UI libraries to build UI experiences that run on iOS, Android, macOS, Windows, Linux, and the web.\n" +
                "\n" +
                "Dart Native (machine code JIT and AOT)\n" +
                "#\n" +
                "During development, a fast developer cycle is critical for iteration. The Dart VM offers a just-in-time compiler (JIT) with incremental recompilation (enabling hot reload), live metrics collections (powering DevTools), and rich debugging support.\n" +
                "\n" +
                "When apps are ready to be deployed to production—whether you're publishing to an app store or deploying to a production backend—the Dart ahead-of-time (AOT) compiler can compile to native ARM or x64 machine code. Your AOT-compiled app launches with consistent, short startup time.\n" +
                "\n" +
                "The AOT-compiled code runs inside an efficient Dart runtime that enforces the sound Dart type system and manages memory using fast object allocation and a generational garbage collector.\n" +
                "\n" +
                "More information:\n" +
                "\n" +
                "Get started: Command-line and server apps\n" +
                "dart tool for running with JIT or AOT compiling to machine code\n" +
                "Write command-line apps\n" +
                "Write HTTP servers\n" +
                "Dart Web (JavaScript dev & prod)\n" +
                "#\n" +
                "Dart Web enables running Dart code on web platforms powered by JavaScript. With Dart Web, you compile Dart code to JavaScript code, which in turn runs in a browser—for example, V8 inside Chrome.\n" +
                "\n" +
                "Dart web contains two compilation modes:\n" +
                "\n" +
                "An incremental development compiler enabling a fast developer cycle\n" +
                "An optimizing production compiler which compiles Dart code to fast, compact, deployable JavaScript. These efficiencies come from techniques such as dead-code elimination.\n" +
                "More information:\n" +
                "\n" +
                "Build a web app with Dart\n" +
                "dart compile js\n" +
                "webdev tool\n" +
                "Web deployment tips\n" +
                "The Dart runtime\n" +
                "#\n" +
                "Regardless of which platform you use or how you compile your code, executing the code requires a Dart runtime. This runtime is responsible for the following critical tasks:\n" +
                "\n" +
                "Managing memory: Dart uses a managed memory model, where unused memory is reclaimed by a garbage collector (GC).\n" +
                "\n" +
                "Enforcing the Dart type system: Although most type checks in Dart are static (compile-time), some type checks are dynamic (runtime). For example, the Dart runtime enforces dynamic checks by type check and cast operators.\n" +
                "\n" +
                "Managing isolates: The Dart runtime controls the main isolate (where code normally runs) and any other isolates that the app creates.\n" +
                "\n" +
                "On native platforms, the Dart runtime is automatically included inside self-contained executables, and is part of the Dart VM provided by the dart run command.\n" +
                "\n" +
                "Learning Dart\n" +
                "#\n" +
                "You have many choices for learning Dart. Here are a few that we recommend:\n" +
                "\n" +
                "Explore Dart in the browser through DartPad, a web-based execution environment for Dart code.\n" +
                "Take a tour of the Dart language, which shows you how to use each major Dart feature.\n" +
                "Complete a Dart tutorial that covers the basics of using Dart to build for the command line.\n" +
                "Work through extensive online training from Dart experts.\n" +
                "Explore the API documentation that describes the Dart core libraries.\n" +
                "Read a book about Dart programming."),
    )

    override fun getAllList(): Flow<List<InformationData>> = flow {
        emit(list)
    }.flowOn(Dispatchers.IO)

    override fun getByNumberList(count: Int): Flow<ArrayList<InformationData>> = flow {
        val ls = ArrayList<InformationData>()
        if (count == 5) {
            ls.addAll(list.shuffled().subList(0, count))
        } else {
            ls.addAll(list.subList(0, count))
        }
        emit(ls)
    }.flowOn(Dispatchers.IO)

    override fun getByCurrentQuery(query: String): Flow<ArrayList<InformationData>> = flow {
        val ls = ArrayList<InformationData>()
        list.forEach {
            if (it.name.toLowerCase().startsWith(query.toLowerCase())) {
                ls.add(it)
            }
        }
        emit(ls)
    }.flowOn(Dispatchers.IO)

}