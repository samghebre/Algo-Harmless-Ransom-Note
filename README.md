# The harmless ransom note

The harmless ransom note is simply a note made of words cut out from a magazine text, Imagine that a kidnapper wants to write a ransom note and he doesn't want it to be handwritten and be traced back to him so he got a magazine and cuts off a whole word and use them to create an untraceable replica of his ransom note.

Note that the words are case-sensitive and must use only whole words available in the magazine, you cannot use substrings or concatenation to create the words and cannot use repeat the words unless there is an available replica of the word.

```
Example 1 :
ransome_note = "this is a secret note for you from a secret admirer";
magazine_text= "puerto rico is a great place you must hike far from "
+"town to find a secret waterfall that i am an admirer of but note that"
+" it is not as hard as it seems this is my advice for you"
```

The harmless ransom note will return false because the word "secret" is used twice and it's found once in the magazine text.

```
Example 2 :
ransome_note = "this is a note for you from a secret admirer";
magazine_text= "puerto rico is a great place you must hike far from "
+"town to find a secret waterfall that i am an admirer of but note that"
+" it is not as hard as it seems this is my advice for you"
```

The harmless ransom note will return ture because the word "secret" is used once and it's found once in the magazine text.


Ransom Note Algorithm
1 - Split Magazine String text to get an Array
2 - Instantiate HashMap for Magazine (What word, How many times it appears)
3 - Loop through Magazine Array
4 - If HashMap contains KeyWord - get KeyValue Pair and Increment Integer count by 1
5 - Else put element in the Hashmap and set Pair to 1
6 - Split Ransom Note String text to get an Array
7 - Loop through Ransom Note Array
8 - If HashMap contains element - decrement Integer count by 1
8a- If Integer count is 0, return false
9 - Else If HashMap does not contain element - return false