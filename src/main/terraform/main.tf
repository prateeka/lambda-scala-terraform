resource "aws_iam_role" "lambda_exec_role" {
  name = "lambda_exec_role"
  assume_role_policy = <<EOF
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Effect": "Allow",
      "Action": "sts:AssumeRole",
      "Principal": {
        "Service": "lambda.amazonaws.com"
      }
    }
  ]
}
EOF

  tags = {
    repo-link = " https://github.com/prateeka/lambda-scala-terraform.git"
  }

}

resource "aws_iam_role_policy_attachment" "test-attach" {
  role = aws_iam_role.lambda_exec_role.name
  policy_arn = data.aws_iam_policy.ReadOnlyAccess.arn
}


data "aws_iam_policy" "ReadOnlyAccess" {
  arn = "arn:aws:iam::aws:policy/service-role/AWSLambdaBasicExecutionRole"
}