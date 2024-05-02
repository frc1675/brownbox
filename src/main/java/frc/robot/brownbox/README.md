# `frc.robot.brownbox`

In all UPS robot projects, the `frc.robot.brownbox` package should be reserved for code coming from this repository or code intended to be integrated back into `brownbox` at the end of the season.

Code going into the `frc.robot.brownbox` package should satisfy the following standards:

* Classes should be parameterized and ready for use in a new robot project
    * Example: CAN IDs or DIO channels should be passed in to a class, not declared inside.
* Code should be documented (at least Javadoc comments on all public fields or methods)
* Classes should be unit tested if the intended behavior of the code is not immediately apparent when reading.
    * Unit tests should be carried to robot projects with any classes that have them for confidence and ability to modify in-season if need arises.
* Code should be reviewed by at least one mentor and pass all CI checks.
