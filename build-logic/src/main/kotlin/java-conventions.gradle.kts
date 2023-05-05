import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    id("base-conventions")
    id("java-library")
    id("net.kyori.indra")
}

indra {
    javaVersions {
        target(20)
    }
}

repositories {
    mavenCentral()
}

afterEvaluate {
    tasks {
        withType<JavaCompile> {
            options.compilerArgs.addAll(listOf("--enable-preview"))
        }

        javadoc {
            (options as CoreJavadocOptions).apply {
                addBooleanOption("-enable-preview", true)
            }
        }

        test {
            jvmArgs(
                "--enable-preview",
                "--enable-native-access=ALL-UNNAMED",
                "-Djava.library.path=$nativeDir/target/debug/",
            )
            testLogging.exceptionFormat = TestExceptionFormat.FULL
        }
    }
}
