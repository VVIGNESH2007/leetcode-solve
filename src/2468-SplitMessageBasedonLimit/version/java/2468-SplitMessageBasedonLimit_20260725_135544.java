// Last updated: 7/25/2026, 1:55:44 PM
1class Solution {
2    public String[] splitMessage(String message, int limit) {
3        int msgLen = message.length();
4        int totalParts = 0;
5
6        for (int b = 1; b <= 10000; b++) {
7            if (getTotalCapacity(b, limit) >= msgLen) {
8                totalParts = b;
9                break;
10            }
11        }
12        
13        // If no valid configuration can hold the message, return empty array
14        if (totalParts == 0) {
15            return new String[0];
16        }
17
18        // Step 2: Construct the actual split string parts
19        String[] result = new String[totalParts];
20        int msgIndex = 0;
21        int bDigits = String.valueOf(totalParts).length();
22
23        for (int a = 1; a <= totalParts; a++) {
24            int aDigits = String.valueOf(a).length();
25            int suffixLength = 3 + aDigits + bDigits;
26            int maxPayloadSpace = limit - suffixLength;
27
28            int currentChunkSize = Math.min(maxPayloadSpace, msgLen - msgIndex);
29            String messageChunk = message.substring(msgIndex, msgIndex + currentChunkSize);
30            msgIndex += currentChunkSize;
31
32            result[a - 1] = messageChunk + "<" + a + "/" + totalParts + ">";
33        }
34
35        return result;
36    }
37
38    private int getTotalCapacity(int b, int limit) {
39        int bDigits = String.valueOf(b).length();
40        int totalCapacity = 0;
41        for (int a = 1; a <= b; ) {
42            int aDigits = String.valueOf(a).length();
43            int nextBoundary = (int) Math.pow(10, aDigits);
44            int end = Math.min(b, nextBoundary - 1);
45            
46            int suffixLength = 3 + aDigits + bDigits;
47            int payloadPerPart = limit - suffixLength;
48
49            if (payloadPerPart <= 0) {
50                return -1; 
51            }
52            
53            int count = end - a + 1;
54            totalCapacity += count * payloadPerPart;
55            
56            a = end + 1; 
57        }
58        
59        return totalCapacity;
60    }
61}
62