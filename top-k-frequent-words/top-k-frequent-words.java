class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       return Arrays.stream(words).collect(Collectors.groupingBy(x -> x , Collectors.counting())).entrySet().stream().sorted((a , b) -> b.getValue()!= a.getValue() ? (int)(b.getValue() - a.getValue()) : a.getKey().compareTo(b.getKey())).limit(k).map(Map.Entry::getKey).toList();
    }
}