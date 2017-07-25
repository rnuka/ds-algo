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

class TrieNode{
  TrieNode[] list = new TrieNode[26];
  String word; //populated only at the end of trienode
  boolean isEnd; //populated only at the end of the trienode, either word or isEnd can be at each trienode
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

Queue

PriorityQueue

Heap

Deque
