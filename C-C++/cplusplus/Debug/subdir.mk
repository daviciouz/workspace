################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../tutoria1.cpp \
../tutorial2.cpp \
../tutorial3.cpp \
../tutorial4.cpp \
../tutorial5.cpp \
../tutorial6.cpp 

OBJS += \
./tutoria1.o \
./tutorial2.o \
./tutorial3.o \
./tutorial4.o \
./tutorial5.o \
./tutorial6.o 

CPP_DEPS += \
./tutoria1.d \
./tutorial2.d \
./tutorial3.d \
./tutorial4.d \
./tutorial5.d \
./tutorial6.d 


# Each subdirectory must supply rules for building sources it contributes
%.o: ../%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


