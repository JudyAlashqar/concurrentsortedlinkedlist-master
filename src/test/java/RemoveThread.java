public class RemoveThread extends TestThread implements Runnable{
    public RemoveThread(RandomSeq seq, int seqPart, SortList setList) {
        super(seq, seqPart, setList);
    }

    @Override
    public void run() {
        for (int i = 0; i < nums.length; i++) {
            boolean result = list.remove(nums[i]);
            if (result)
            {
                list.succeededDeletions += 1;
            }
            else {
                list.failedDeletions += 1;
            }
        }
    }
}