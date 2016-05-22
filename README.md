Description
-----------

This is one of possible implementations of the challenge. Requirements to execute the code: Ansible 2, boto and AWS credentials

Requirements:

    Ansible >= 2
    python >= 2.6
    boto
    AWS credentials, exported in shell

Usage:

    git clone https://github.com/cdugz/hatch-demo && cd hatch-demo
    export AWS_ACCESS_KEY_ID=<aws_access_key>
    export AWS_SECRET_ACCESS_KEY=<aws_secret_access_key>
    cd ansible && ansible-playbook setup.yml

The playbook spins up AWS EC2 instance (Amazon AMI), sets up all necessary parameters (key, security groups, etc.) and provisions it with all necessary libraries. On running EC2 instance, java code is built with maven and executed in docker container.

Once ansible run is finished, user can query AWS instance on public IP at port 8080 to check functionality.

