plugins {
    id("java")
    jacoco
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core:5.9.0")

}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)

    testLogging.events("passed", "skipped", "failed")
    testLogging.exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    testLogging.info
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required.set(false)
        csv.required.set(false)
        html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
    }

    finalizedBy(tasks.jacocoTestCoverageVerification)

    println(
        "------------------------------------------------------------------------------------------------\n " +
            "For test coverage get jacoco report at: build/reports/jacoco/test/html/index.html\n" +
            "------------------------------------------------------------------------------------------------"
    )
}

tasks.jacocoTestCoverageVerification {
    violationRules {
        rule {
            excludes = listOf("org.ik.Main")
            limit {
                minimum = "0.95".toBigDecimal()
            }
            element = "CLASS"
        }
    }
}