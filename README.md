# FinchLib
This is a library of programs that make programming and using the [Finch](https://finchrobot.com) easy.

## What is a Finch?
A Finch is a small robot designed to teach Computer Science to students in Elementary, Middle, or High School.
They can be bought for $99 from [this link](http://store.birdbraintechnologies.com/product-p/fr-1.htm).

## Why make the library?
Mainly to provide an easier interface for using the Finch. For example, I provide a method (DriveTrain.drive()) that uses the
Finch.setWheelVelocities() method to drive either forward or backward, but instead of requiring students to use a number from
 0-255, all they need to do is use the EnumDirection type and the library will automatically make the Finch drive forward.
