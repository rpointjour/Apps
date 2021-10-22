import re
# Import regular expression library
pattern = "[a-zA-Z0-9]+@[a-zA-Z]+.(com|edu|net)"
# Initialize pattern for email validation


def valid_email(email) -> str:

    if re.search(pattern, email):
        print("valid email")
    else:
        print("invalid email")
    return f"email: {email}"
# Set condition for email validation
# return email upon validation


if __name__ == '__main__':
    e = valid_email("rpointjour2020@fau.edu")
    print(e)
