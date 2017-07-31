class LinkedListNode<T>{
    T value;
    LinkedListNode<T> next;
    LinkedListNode(T v){ this.value = v}
}

private class BinaryTreeNode<T>
{
      private T data;
      private BinaryTreeNode<T> left, right;
      public BinaryTreeNode(T data){ this.data = data;}
}

class Graph<T> {
    //Map of adjacency lists for each node
    Map<T, Set<T>> adj;
    public Graph(T[] nodes) {
        adj = new HashMap<T, LinkedList<T>>();
        for (int i = 0; i < nodes.length; ++i) {
            adj.put(i, new HashSet<T>());
        }
    }
    public addNeighbor(int v1, int v2) { adj.get(v1).add(v2);}
    public List<Integer> getNeighbors(int v) {return adj.get(v); }
}

class Trie{
    TrieNode root;
    class TrieNode {
        // R links to node children
        private TrieNode[] links;
        private final int R = 26;
        private boolean isEnd;
        private String endWord;
        public TrieNode() {links = new TrieNode[R];}
        public boolean containsKey(char ch) {return links[ch -'a'] != null;}
        public TrieNode get(char ch) {return links[ch -'a'];}
        public void put(char ch, TrieNode node) {links[ch -'a'] = node;}
        public void setEnd() {isEnd = true;}
        public boolean isEnd() {return isEnd;}
    }
    void buildTrie(String word);
    boolean search(String word);
    boolean startsWith(String prefixWord);
}
 public static class NestedInteger {
        private Integer value;
        private List<NestedInteger> list;
        public NestedInteger(Integer val) {value = val;}
        public NestedInteger(List<NestedInteger> nestedLists) {list = nestedLists;}
        public boolean isInteger() { return value != null;}
        public Integer getInteger() { return value;}
        public List<NestedInteger> getList() {return list; }
 }
 
 public class HashMap<K,V> {
   class Entry<K,V>{
        K key;
        V value;
        int hash;
        Entry<K,V> next;
    }
    Entry[] table;
    public V get(K key){ }
    public void put(K key, V value){}
    int size(){ return size;    }
    boolean isEmpty(){        return size==0;}
    boolean contains(K key){    }
}

Stack
    Stack<K> stack = new Stack<K>();
    stack.push(); stack.pop(); stack.size(); stack.isEmpty();

Queue
    Queue<K> queue = new LinkedList<K>();
    queue.add(K val); queue.remove(); queue.size(); queue.isEmpty();

PriorityQueue
    PriorityQueue<Node> pq = new PriorityQueue<Node>(new Comparator<Node>(){
             @override
            public int compare(Node n1, Node n2){ return Integer.compare(n1.value, n2.value));}
    });

Heap
    Min-heap eg: PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    Max-heap eg: PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder());

Deque
    Deque deque = new LinkedList<>(); deque.offerFirst(); deque.offerLast(); //adding it in tail
    deque.removeFirst(); deque.removeLast();
