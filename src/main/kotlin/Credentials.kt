https://jitpack.iorepositories {
    ...
    maven(url = "https://jitpack.io")
}dependencies {
    implementation("com.github.hadiyarajesh:insta-bot:Tag")
}object Credentials {
    const val USERNAME = mr om 
    const val PASSWORD = "your_instagram_password"
}Credentials.PASSWORDCredentials.USERNAME    val username = Credentials.USERNAME
    val password = Credentials.PASSWORD

    val bot = InstagramBot()
    bot.prepare(username)
    bot.login(username, password)// Get 100 followers of you
bot.getSelfFollowers(100).collect { println(it) }
// Like 5 medias from explore page
bot.likeMediasByExplorePage(5).collect { println(it) }
// Approve all pending follow requests
bot.approveAllPendingFollowRequests().collect { println(it) }
// Watch stories of 200 users based on given location
bot.watchLocationUsersStories("enter_location_name_here", 200).collect { println(it) }
