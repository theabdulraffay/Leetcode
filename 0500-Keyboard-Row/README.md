# 500. Keyboard Row

Given an array of strings `words`, return the words that can be typed using letters of the alphabet on only one row of the American keyboard.

In the American keyboard:

- The first row consists of the characters "qwertyuiop".
- The second row consists of the characters "asdfghjkl".
- The third row consists of the characters "zxcvbnm".

## Example

### Example 1:

Input: `words = ["Hello","Alaska","Dad","Peace"]`
Output: `["Alaska","Dad"]`

### Example 2:

Input: `words = ["omk"]`
Output: `[]`

### Example 3:

Input: `words = ["adsdf","sfd"]`
Output: `["adsdf","sfd"]`

## Constraints:

- `1 <= words.length <= 20`
- `1 <= words[i].length <= 100`
- `words[i]` consists of English letters (both lowercase and uppercase).
