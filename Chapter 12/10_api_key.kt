val apiKey = "your_api_key"
...
val resp: HttpResponse = ktorClient.get(marsUrl) {
    header("Authorization", "Bearer $apiKey")
}
...
