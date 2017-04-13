CREATE TABLE [dbo].[UserAccounts2]
(
	[Id] nvarchar(128) NOT NULL PRIMARY KEY, 
    [Email] NVARCHAR(256) NULL, 
    [EmailConfirmed] BIT NOT NULL, 
    [PasswordHash] NVARCHAR(MAX) NULL, 
    [SecurityStamp] NVARCHAR(MAX) NULL, 
    [TwoFactorEnabled] BIT NOT NULL, 
    [LockoutEndDataUtc] DATETIME NULL, 
    [LockouEnabled] BIT NOT NULL, 
    [AccessFailedCount] INT NOT NULL, 
    [UserName] NVARCHAR(256) NOT NULL

)
