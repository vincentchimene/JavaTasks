from unittest import TestCase
import classPrime

class TestIsPrime(TestCase):

    def test_that_isPrime_function_exists(self):
        classPrime.isPrime(2)

    def test_that_1_returns_false(self):
        actual = classPrime.isPrime(1)
        self.assertFalse(actual)

    def test_that_2_returns_true(self):
        actual = classPrime.isPrime(2)
        self.assertTrue(actual)

    def test_that_71_returns_true(self):
        actual = classPrime.isPrime(71)
        self.assertTrue(actual)

    def test_that_45_returns_false(self):
        actual = classPrime.isPrime(45)
        self.assertFalse(actual)

