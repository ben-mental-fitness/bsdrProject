INSERT INTO SDR_LIVE_MainTable (
	SourceFileinstanceID,
    row_id, 
    InterviewType,
    Respondent_ID,
    Question_ID,
    Question,
    Full_Answer,
    Broken_Answer,
    Driver_of_Change,
    Outcome_1,
    Outcome_2,
    Outcome_3,
    Attribution__1_9,
    Domain_Attributed,
    RespDomain,
    RespDriver,
    RespDriverDomain,
    ProjectName,
    FileinstanceID,
    ParentFileinstanceID
)
VALUES (
	1,
    1,
    'Dummy IntervType 1',
    '1',
    '1',
    'This is dummy quiestion 1',
    'This is dummy full answer 1',
    'This is dummy broken answer 1',
    'P1',
    'O1',
    'O2',
    'O3',
    '1',
    'This is dummy Domain Attributed 1',
    'This is dummy RespDomain 1',
    'This is dummy ReaspDriver 1',
    'This is dummy RespDriverDomain 1',
    'This is dummy ProjectName 1',
    1,
    1    
),
(
	2,
    2,
    'Dummy IntervType 2',
    '2',
    '2',
    'This is dummy quiestion 2',
    'This is dummy full answer 2',
    'This is dummy broken answer 2',
    'P1',
    'O1',
    'O2',
    'O3',
    '1',
    'This is dummy Domain Attributed 2',
    'This is dummy RespDomain 2',
    'This is dummy ReaspDriver 2',
    'This is dummy RespDriverDomain 2',
    'This is dummy ProjectName 2',
    2,
    2    
),
(

	3,
    3,
    'Dummy IntervType 3',
    '3',
    '3',
    'This is dummy quiestion 3',
    'This is dummy full answer 3',
    'This is dummy broken answer 3',
    'P1',
    'O1',
    'O2',
    'O3',
    '1',
    'This is dummy Domain Attributed 3',
    'This is dummy RespDomain 3',
    'This is dummy ReaspDriver 3',
    'This is dummy RespDriverDomain 3',
    'This is dummy ProjectName 3',
    3,
    3    
);


INSERT INTO SDR_LIVE_DataEntry
VALUES (
	'Dummy question number 1',
    'Dummy question 1',
    'Dummy answer 1',
    '1',
    'Dummy SheetName 1',
    1,
    1,
    'Dummy ProjectName 1'
),
(
	'Dummy question number 2',
    'Dummy question 2',
    'Dummy answer 2',
    '2',
    'Dummy SheetName 2',
    2,
    2,
    'Dummy ProjectName 2'
),
(
	'Dummy question number 3',
    'Dummy question 3',
    'Dummy answer 3',
    '3',
    'Dummy SheetName 3',
    3,
    3,
    'Dummy ProjectName 3'
);

INSERT INTO SDR_LIVE_Tagging
VALUES (
	'Code 1',
    'Dummy description 1',
    '1',
    'Dummy cluster description 1',
    'Dummy project name 1',
    1,
    1
),
(
	'Code 2',
    'Dummy description 2',
    '2',
    'Dummy cluster description 2',
    'Dummy project name 2',
    2,
    2
),
(
	'Code 3',
    'Dummy description 3',
    '3',
    'Dummy cluster description 3',
    'Dummy project name 3',
    3,
    3
)
