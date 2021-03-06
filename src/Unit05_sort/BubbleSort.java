package Unit05_sort;

/**
 * 冒泡排序
 *
 * 冒泡排序只会操作相邻的两个数据。
 * 每次冒泡操作都会对相邻的两个元素进行比较，看是否满足大小关系要求。如果不满足就让它俩互换。
 * 一次冒泡会让至少一个元素移动到它应该在的位置，重复 n 次，就完成了 n 个数据的排序工作。
 * 上面的冒泡过程还可以优化。当某次冒泡操作已经没有数据交换时，说明已经达到完全有序，不用再继续执行后续的冒泡操作。
 * 冒泡排序包含两个操作原子，比较和交换。
 *
 * 是原地排序算法么？是  空间复杂度O(1)
 * 是稳定的排序算法么？是  当有相邻的两个元素大小相等的时候，我们不做交换
 * 时间复杂度是多少？
 * 最好时间复杂度O(n)   要排序的数据已经是有序了
 * 最坏时间复杂度O(n^2)  要排序的数据是倒序
 * 平均时间复杂度O(n^2)
 *
 * 排序算法平均复杂度分析
 * 如果用概率论方法定量分析平均时间复杂度，涉及的数学推理和计算就会很复杂。下面的平均时间复杂度推导过程其实并不严格，但是很多时候很实用。
 * 这里还有一种思路，通过“有序度”和“逆序度”这两个概念来进行分析。
 * 有序度是数组中具有有序关系的元素对的个数。有序元素对用数学表达式表示就是这样：
 * 有序元素对：a[i] <= a[j], 如果i < j。
 * 2,4,3,1,5,6  这组数据有序度为11，有序元素对为11 (2,4)(2,3)(2,5)(2,6)(4,5)(4,6)(3,5)(3,6)(1,5)(1,6)(5,6)
 * 对于一个倒序排列的数组，比如 6，5，4，3，2，1，有序度是 0；
 * 对于一个完全有序的数组，比如 1，2，3，4，5，6，有序度就是 n*(n-1)/2，也就是 15。
 * 我们把这种完全有序的数组的有序度叫作满有序度。逆序度的定义正好跟有序度相反（默认从小到大为有序）。
 * 关于这三个概念，我们还可以得到一个公式：逆序度 = 满有序度 - 有序度。
 * 我们排序的过程就是一种增加有序度，减少逆序度的过程，最后达到满有序度，就说明排序完成了。
 * 冒泡排序包含两个操作原子，比较和交换。每交换一次，有序度就加 1。不管算法怎么改进，交换次数总是确定的，即为逆序度，也就是n*(n-1)/2–初始有序度。
 * 对于包含 n 个数据的数组进行冒泡排序，
 * 最坏情况下，初始状态的有序度是 0，所以要进行 n*(n-1)/2 次交换。
 * 最好情况下，初始状态的有序度是 n*(n-1)/2，就不需要进行交换。
 * 我们可以取个中间值 n*(n-1)/4，来表示初始有序度既不是很高也不是很低的平均情况。
 * 换句话说，平均情况下，需要 n*(n-1)/4 次交换操作，比较操作肯定要比交换操作多，而复杂度的上限是 O(n2)，所以平均情况下的时间复杂度就是 O(n2)。
 *
 */
public class BubbleSort {

    private final int[] arr;

    public BubbleSort() {
        this.arr = new int[]{7,5,6,10,3,9,10};
    }

    private void asc() {
        for (int i = 0;i<arr.length;i++) {
            boolean flag = false;
            for (int j = 0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    private void printAll() {
        StringBuilder sb = new StringBuilder();
        for (int i:arr) {
            sb.append(i).append("\t");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.asc();
        bubbleSort.printAll();
    }



}
