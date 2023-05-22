public abstract class SortList {

    public Entry head;
    public int succeededDeletions = 0;
    public int failedDeletions = 0;
    public int succeededContain = 0;
    public int failedContain = 0;

    public SortList() {
        this.head = new Entry(Integer.MIN_VALUE);
        this.head.next =new Entry(Integer.MAX_VALUE);
    }

    public  abstract  boolean add(Integer obj);
    public  abstract  boolean remove(Integer obj);
    public  abstract  boolean contain(Integer obj);

    public int count()
    {
        int length = 0;
        Entry curr = this.head;
        while (curr != null){
            length += 1;
            curr = curr.next;
        }
        return length;
    }

    public boolean checkSorted()
    {
        boolean check = true;
        Entry curr = this.head;
        while (curr.next != null){
            if (curr.object > curr.next.object)
            {
                check = false;
                break;
            }
            curr = curr.next;
        }
        return check;
    }
    public void printList(){
        Entry curr = this.head;
        while (curr != null){
            System.out.println(curr.object);
            curr = curr.next;

        }
    }
}
