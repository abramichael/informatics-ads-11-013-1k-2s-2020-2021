import org.junit.Assert;
import org.junit.Test;

public class TestMyIntegerArrayCollection {

    // Test Driven Development
    @Test
    public void createdCollectionIsEmpty() {
        // Assert
        MyIntegerArrayCollection a = new MyIntegerArrayCollection();
        Assert.assertTrue(a.isEmpty());
    }

    @Test
    public void addElementToEmptyListMakesItNonEmpty() {
        MyIntegerArrayCollection a = new MyIntegerArrayCollection();
        a.add(1);
        Assert.assertFalse(a.isEmpty());
    }
    @Test
    public void addElementToEmptyListMakesSizeEquals1() {
        MyIntegerArrayCollection a = new MyIntegerArrayCollection();
        a.add(100);
        Assert.assertEquals(1,a.size());
    }

}
