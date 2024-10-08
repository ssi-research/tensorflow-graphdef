from setuptools import setup, find_packages

setup(
    name='tensorflow-graphdef',
    version='4.25.3',
    packages=find_packages(),
    package_data={
        '': ['LICENSE.txt, NOTICE.txt'],
    },
    include_package_data=True,
    install_requires=[
        'protobuf==4.25.3'
    ]
)