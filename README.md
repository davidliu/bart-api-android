# bart-api-android [![CircleCI](https://circleci.com/gh/davidliu/bart-api-android.svg?style=svg)](https://circleci.com/gh/davidliu/bart-api-android)

Provides an API for use with [Retrofit](https://github.com/square/retrofit) for querying the [BART api](http://api.bart.gov/docs/overview/index.aspx).

## Download

```
implementation "com.squareup.retrofit2:retrofit:x.y.z"
implementation "com.github.davidliu.bart-api-android:bartapi:-SNAPSHOT"
```

## Example usage

```
val gson = GsonBuilder()
    .registerTypeAdapter(Boolean::class.java, BooleanSerializer())
    .registerTypeAdapter(Int::class.java, IntegerSerializer())
    .create()

val okhttp = OkHttpClient.Builder().build()

val retrofit = Retrofit.Builder()
    .client(okHttpClient)
    .addConverterFactory(GsonConverterFactory.create(gson))
    .baseUrl(serverUrl)
    .build()

val bartApi = retrofit.create(BartApi::class.java)
```
