class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer buffer = new StringBuffer();
        int remainder;
        while (columnNumber > 0){
            remainder = (columnNumber - 1) % 26;
            buffer.append(Character.toString('A' + remainder));
            columnNumber = (columnNumber - remainder) / 26;
        }
        return buffer.reverse().toString();
    }
}
