plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework:spring-webmvc:5.3.22")
    compileOnly("javax.servlet:javax.servlet-api:4.0.1")
    compileOnly("org.projectlombok:lombok:1.18.28")
    implementation("org.hibernate:hibernate-core:5.6.9.Final")
    implementation("mysql:mysql-connector-java:8.0.29")
    implementation("org.springframework.data:spring-data-jpa:2.5.4")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")
    implementation("org.springframework:spring-orm:5.3.22")
    implementation("org.springframework:spring-context:5.3.21")
    implementation("org.modelmapper:modelmapper:3.1.1")



}

tasks.test {
    useJUnitPlatform()
}