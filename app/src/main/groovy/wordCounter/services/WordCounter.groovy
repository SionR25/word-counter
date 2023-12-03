package wordCounter.services

static Map<String,Integer> countWords(String string) {
    // If empty string or only contains spaces, return empty HashMap
    if (string.strip() == "") {
        return [:]
    }

    ArrayList<String> wordList = string.split(" ")
    HashMap<String,Integer> wordCount = [:]
    // Iterate through words and add count to HashMap
    for (word in wordList) {
        word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "")
        if (wordCount.containsKey(word)) {
            wordCount[word] = wordCount[word] + 1
        } else {
            wordCount[word] = 1
        }
    }

    // Return a descending order (by count) Map
    return wordCount.sort({key1, key2 -> key2.value <=> key1.value})
}