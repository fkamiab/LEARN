import numpy as np

class Time():
    '''
    attributes: hours, minutes, seconds
    '''
    def __init__(self, hours=0, minutes=0, seconds=0):
        self.hours = hours
        self.minutes = minutes
        self.seconds = seconds

    def __str__(self):
        return '%.2d:%.2d:%.2d' % (self.hours, self.minutes, self.seconds)
        
    
    def print_time(self):
        print '%.2d:%.2d:%2d' % (self.hours, self.minutes, self.seconds)

    def time_to_int(self):
        minutes = self.hours * 60 + self.minutes
        seconds = minutes * 60 + self.seconds
        return seconds

    def increment(self, seconds):
        seconds += self.time_to_int()
        return int_to_time(seconds)



def int_to_time(seconds):
    time = Time()
    minutes, time.seconds = divmod(seconds, 60)
    time.hours, time.minutes = divmod(minutes, 60)
    return time



analysistime = Time(9, 45, 40)
print analysistime
#analysistime.hours = 19
#analysistime.minutes = 43
#analysistime.seconds = 10

#analysistime.increment(60).print_time()

analysistime.print_time()

    

