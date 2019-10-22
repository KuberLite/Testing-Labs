using System;
using lab3Testing;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace UnitTestProject1
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TriangleExistsWithCorrectValues()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(19, 10, 25), true);
        }

        [TestMethod]
        public void TriangleDoesNotExistWithWrongValues()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(19, 1, 25), false);
        }

        [TestMethod]
        public void TriangleDoesNotExistWithValuesLessThanZero()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(19, 1, -25), false);
        }

        [TestMethod]
        public void TriangleExistsWithTheSameValues()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(5, 5, 5), true);
        }

        [TestMethod]
        public void TriangleDoesNotExistWithZeroValue()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(0, 5, 5), false);
        }

        [TestMethod]
        public void TriangleDoesNotExistWhenAllValuesAreZero()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(0, 0, 0), false);
        }

        [TestMethod]
        public void TriangleExistsWithDoubleValues()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(1.33, 5.123, 5.133), true);
        }

        [TestMethod]
        public void TriangleExistsWhenInequalityIsEqual()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(1, 5, 6), true);
        }

        [TestMethod]
        public void TriangleDoesNotExistWhenAllValuesAreLessThanZero()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(-1, -5, -6), false);
        }

        [TestMethod]
        public void TriangleExistsWithDoubleAndIntValues()
        {

            Class1 class1 = new Class1();

            Assert.AreEqual(class1.IsTriangleExists(1.123, 5, 4.542), true);
        }
    }
}
