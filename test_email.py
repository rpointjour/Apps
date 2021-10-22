import unittest
from email_validation import valid_email


class TestEmailValidation(unittest.TestCase):
    def test_valid_email(self):
        self.assertEqual(valid_email("n@fg.com"), "email: n@fg.com")  # Test email for validation


if __name__ == '__main__':
    unittest.main()
