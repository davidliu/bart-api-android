# bartapi-mock 

Provides mock responses for use with [MockWebServer](https://github.com/square/okhttp/tree/master/mockwebserver). Useful for testing offline or after service hours.

## Download

```
implementation "com.squareup.okhttp3:mockwebserver:x.y.z"
implementation "com.github.davidliu.bart-api-android:bartapi-mock:-SNAPSHOT"
```

## Example Usage

```
val server = MockWebServer().apply {
    dispatcher = BartMockDispatcher()
    start()
}

val serverUrl = server.url("/api/").toUrl()

val retrofit = Retrofit.Builder()
      .baseUrl(serverUrl)
      /* ... */
      .build()

val bartApi = retrofit.create(BartApi::class.java)
```
