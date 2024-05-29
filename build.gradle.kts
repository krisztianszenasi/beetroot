plugins {
    id("java")
    id("antlr")
    id("com.github.ben-manes.versions") version "0.51.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core:5.12.0")
    implementation("org.antlr:antlr4:4.13.1")
}

tasks.test {
    useJUnitPlatform()
}