object Dependencies {


    object Androidx {
        val core by lazy { "androidx.core:core-ktx:1.7.0" }
        val lifecycle by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1" }
        val activityCompose by lazy { "androidx.activity:activity-compose:1.3.1" }

        object Compose {
            val ui by lazy { "androidx.compose.ui:ui:${Versions.compose_version}" }
            val preview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose_version}" }
            val material3 by lazy { "androidx.compose.material3:material3:1.0.0-alpha11" }

        }
    }

    object Test {
        val junit by lazy { "junit:junit:4.13.2" }

        object Androidx {
            val junit by lazy { "androidx.test.ext:junit:1.1.5" }
            val espresso by lazy { "androidx.test.espresso:espresso-core:3.4.0" }

            object Compose {
                val junit4 by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose_version}" }
                val tooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose_version}" }
                val testManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose_version}" }
            }

        }
    }


}