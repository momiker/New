plugins {
    id("lib-multisrc")
}

base {
    archivesName = "arabtoons"
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":lib"))
            }
        }
    }
}
