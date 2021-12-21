plugins {
    `android-application`
    kotlin("android")
    kotlin("kapt")
    hilt
    wire
}

androidAppConfig {
    defaultConfig {
        applicationId = "nick.wire_fun"
        versionCode = 1
        versionName = "1.0"

        kapt {
            arguments {
                arg("room.schemaLocation", "$projectDir/schemas")
            }
        }
    }

    wire {
        kotlin {}
    }
}

dependencies {
    implementation(Dependencies.activity)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.Fragment.runtime)
    implementation(Dependencies.vectorDrawable)
    implementation(Dependencies.constraintLayout)
    implementation(Dependencies.material)
    implementation(Dependencies.photoView)
    implementation(Dependencies.Navigation.runtime)
    implementation(Dependencies.Navigation.fragment)
    implementation(Dependencies.Navigation.ui)
    implementation(Dependencies.Dagger.runtime)
    implementation(Dependencies.Dagger.Hilt.runtime)
    implementation(Dependencies.Retrofit.runtime)
    implementation(Dependencies.Retrofit.moshi)
    implementation(Dependencies.Moshi.runtime)
    implementation(Dependencies.Moshi.adapters)
    implementation(Dependencies.Room.runtime)
    implementation(Dependencies.Room.roomKtx)
    implementation(Dependencies.OkHttp.loggingInterceptor)
    implementation(Dependencies.multidex)
    implementation(Dependencies.coil)
    implementation(Dependencies.Work.runtime)
    implementation(Dependencies.Lifecycle.runtime)
    implementation(Dependencies.Wire.runtime)
    implementation(Dependencies.Wire.grpcClient)

//    debugImplementation(Dependencies.leakCanary)
    debugImplementation(Dependencies.Fragment.testing)

    testImplementation(Dependencies.junit)
    defaultAndroidTestDependencies()

    kapt(Dependencies.Moshi.kotlinCodegen)
    kapt(Dependencies.Room.compiler)
    kapt(Dependencies.Dagger.compiler)
    kapt(Dependencies.Dagger.Hilt.compiler)
}
