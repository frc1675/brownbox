# brownbox

`brownbox` is intended to be a storage place to maintain evergreen UPS control components.

It can also be used as a prototyping testbed by making a new branch and working from there.
It should not be used as a direct template for a robot project necessarily.
Copy/pasting entire classes from this repository to UPS robot projects is the currently intended use case of the code stored here.

`brownbox` should be updated/retrofitted each year as the new WPILib is released, if necessary.

## Evergreen Classes

UPS evergreen classes are at `src/main/java/frc/robot/brownbox`.
In all UPS robot projects, the `frc.robot.brownbox` package should be reserved for code coming from this repository or code intended to be integrated back into `brownbox` at the end of the season.

Code going into the `frc.robot.brownbox` package should satisfy the following standards:

* Classes should be parameterized and ready for use in a new robot project
    * Example: CAN IDs or DIO channels should be passed in to a class, not declared inside.
* Code should be documented (at least Javadoc comments on all public fields or methods)
* Classes should be unit tested if the intended behavior of the code is not immediately apparent when reading.
    * Unit tests should be carried to robot projects with any classes that have them for confidence and ability to modify in-season if need arises.
* Code should be reviewed by at least one mentor and pass all CI checks.

## Other stuff in brownbox

Everything not in the `frc.robot.brownbox` package should facilitate a quick/easy jump-off point for testing new ideas in a robot code project for testing in simulator. Large features are ideally toggleable via commenting a few lines in as few places as possible.
