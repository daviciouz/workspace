#!/bin/bash

# The following are steps to create a file system within a file

# Creating a 30MB disk file (zero-filled) called virtualfs in the root (/) directory

dd if=/dev/zero of=/virtualfs bs=1024 count=30720 
echo "virtualfs created"


# Confirming that the current system is not using any loopback devices.

if [ $(losetup -f) = "/dev/loop0" ]; then
	echo "current system is not using any loopback device"
fi

echo "Attaching the first Linux loopback device (/dev/loop0)"
losetup /dev/loop0 /virtualfs 


echo $?

echo "creating a Linux EXT3 file system with 1% reserved block count on the loopback device"
mkfs -t ext3 -m 1 -v /dev/loop0 


echo "creating a directory (as mount point) in /mnt"
mkdir /mnt/vfs 


echo "verify configuration"
mount -t ext3 /dev/loop0 /mnt/vfs 

# To confirm its “disk usage

df -h

# Adjust tunable filesystem parameters. This command allows us to adjust various tunable parameters of the ext2/ext3 filesystems
tune2fs -l /dev/loop0 

touch testfile.txt

ls -ltr


http://tldp.org/HOWTO/Partition/devices.html
https://en.wikipedia.org/wiki/Device_file
http://unix.stackexchange.com/questions/101759/difference-between-device-file-and-device-drivers
http://www.tldp.org/LDP/sag/html/filesystems.html
https://www.bleepingcomputer.com/tutorials/introduction-to-mounting-filesystems-in-linux/
http://www.walkernews.net/2007/07/01/create-linux-loopback-file-system-on-disk-file/


# device 

A device file is an interface for a device driver that appears in a file system as if it were an ordinary file
Devices are special nomenclature that linux uses to refer to hard drive partitions. A device file is a file with
type c ( for "character" devices, devices that do not use the buffer cache) or 
b (for "block" devices, which go through the buffer cache). In Unix-like operating systems, these are usually 
found under the /dev directory and are also called device nodes In Linux, all disks are represented as block devices only.
You can write to these devices directly (using cat or dd). 
For instance, the character device file which represents the mouse, /dev/input/mice exposes the movement of the mouse as 
a character stream, whereas the block device file representing a hard disk, such as /dev/sda
The only important thing with a device file are its major and minor device numbers
When accessing a device file, the major number selects which device driver is being called to perform the input/output operation. 
This call is being done with the minor number as a parameter and it is entirely up to the driver how the minor number is being interpreted. 
The driver documentation usually describes how the driver uses minor numbers.

from my system this is an example of a block device:

stepsei@stepseilab:~$ ls -l /dev/sda
brw-rw---- 1 root disk 8, 0 Nov 30 19:28 /dev/sda



# file system

A filesystem is the methods and data structures that an operating system uses to keep track of files on a disk or partition; that is, 
the way the files are organized on the disk. Before a partition or disk can be used as a filesystem, it needs to be initialized, and 
the bookkeeping data structures need to be written to the disk. This process is called making a filesystem.
filesystem is used to control how data is stored and retrieved. Without a file system, information placed in a storage medium would be 
one large body of data with no way to tell where one piece of information stops and the next begins. By separating the data into pieces
and giving each piece a name, the information is easily isolated and identified. The linux OS support several filesystems such as minix, 
xia, ext3, ext2, ext, reiserfs, jfs, xfs, vfat, nfs, etc. 

# mount point
Before one can use a filesystem, it has to be mounted. When a filesystem no longer needs to be mounted, it can be unmounted. Mounting a 
filesystem simply means making the particular filesystem accessible at a certain point in the Linux directory tree. When mounting a filesystem
it does not matter if the filesystem is a hard disk partition, CD-ROM, floppy, or USB storage device. You simply need to know the device name
associated with the particular storage device and a directory you would like to mount it to.
The file system is best visualized as a tree, rooted, as it were, at /. /dev, /usr, and the other directories in the root directory are branches, 
which may have their own branches, such as /usr/local, and so on. There are various reasons to house some of these directories on separate file
systems. /var contains the directories log/, spool/, and various types of temporary files, and as such, may get filled up. Filling up the root file
system is not a good idea, so splitting /var from / is often favorable. A mount point is an existing directory on which to mount the filesystem. 